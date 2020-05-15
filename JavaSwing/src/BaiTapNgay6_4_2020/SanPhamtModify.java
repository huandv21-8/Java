/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay6_4_2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SanPhamtModify {
    
    

    public static List<SanPham> findAll() {
        List<SanPham> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "SELECT sanpham.*, danhmuc.* FROM `sanpham` inner join danhmuc on sanpham.id_danhmuc = danhmuc.id_danhmuc";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                SanPham sanPham = new SanPham(
                        resultSet.getInt("id_sanpham"),
                        resultSet.getFloat("gia"),
                        resultSet.getString("tensanpham"),
                        resultSet.getString("ngaynhap"),
                        resultSet.getString("ngayban"),
                        resultSet.getString("hansudung"),
                        resultSet.getString("mota"),
                        resultSet.getInt("id_danhmuc"),
                        resultSet.getString("tendanhmuc")
                );
                list.add(sanPham);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

   

    public static void insertdanhmuc(DanhMuc dm) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "insert into danhmuc(id_danhmuc, tendanhmuc) values(?,?)";
            statement = connection.prepareCall(sql);
            statement.setInt(1, dm.getId_danhmuc());
            statement.setString(2, dm.getTenDanhMuc());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public static void insertsanpham(SanPham sp, DanhMuc dm) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "insert into sanpham(id_sanpham,id_danhmuc, tensanpham,gia,ngaynhap,ngayban,hansudung,mota) values(?,?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            statement.setInt(1, sp.getId_sanpham());
            statement.setInt(2, dm.getId_danhmuc());
            statement.setString(3, sp.getTenSanPhamString());
            statement.setFloat(4, sp.getGia());
            statement.setString(5, sp.getNgayNhap());
            statement.setString(6, sp.getNgayban());
            statement.setString(7, sp.getNgayHetHan());
            statement.setString(8, sp.getMoTa());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
    
     public static void deletesanpham(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "delete from sanpham where id_sanpham = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, id);           
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
     
     public static void deletedanhmuc(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "delete from danhmuc where id_danhmuc = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, id);           
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
     
     public static List<SanPham> timkiem(String tensanpham) {
        List<SanPham> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "SELECT sanpham.*, danhmuc.* FROM `sanpham` inner "
                    + "join danhmuc on sanpham.id_danhmuc = danhmuc.id_danhmuc where sanpham.tensanpham like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1,"%"+tensanpham+"%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                SanPham sanPham = new SanPham(
                        resultSet.getInt("id_sanpham"),
                        resultSet.getFloat("gia"),
                        resultSet.getString("tensanpham"),
                        resultSet.getString("ngaynhap"),
                        resultSet.getString("ngayban"),
                        resultSet.getString("hansudung"),
                        resultSet.getString("mota"),
                        resultSet.getInt("id_danhmuc"),
                        resultSet.getString("tendanhmuc")
                );
                list.add(sanPham);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

   
public static List<SanPham> tonkho() {
        List<SanPham> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "SELECT sanpham.*, danhmuc.* FROM `sanpham` inner join danhmuc on sanpham.id_danhmuc = danhmuc.id_danhmuc WHERE sanpham.ngayban is null";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                SanPham sanPham = new SanPham(
                        resultSet.getInt("id_sanpham"),
                        resultSet.getFloat("gia"),
                        resultSet.getString("tensanpham"),
                        resultSet.getString("ngaynhap"),
                        resultSet.getString("ngayban"),
                        resultSet.getString("hansudung"),
                        resultSet.getString("mota"),
                        resultSet.getInt("id_danhmuc"),
                        resultSet.getString("tendanhmuc")
                );
                list.add(sanPham);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }
  
public static List<SanPham> daban() {
        List<SanPham> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "SELECT sanpham.*, danhmuc.* FROM `sanpham` inner join danhmuc on sanpham.id_danhmuc = danhmuc.id_danhmuc WHERE sanpham.ngayban is not null";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                SanPham sanPham = new SanPham(
                        resultSet.getInt("id_sanpham"),
                        resultSet.getFloat("gia"),
                        resultSet.getString("tensanpham"),
                        resultSet.getString("ngaynhap"),
                        resultSet.getString("ngayban"),
                        resultSet.getString("hansudung"),
                        resultSet.getString("mota"),
                        resultSet.getInt("id_danhmuc"),
                        resultSet.getString("tendanhmuc")
                );
                list.add(sanPham);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

public static List<SanPham> conhansudung() {
        List<SanPham> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "SELECT sanpham.*, danhmuc.* FROM `sanpham` inner join danhmuc on sanpham.id_danhmuc = danhmuc.id_danhmuc WHERE (CURDATE() > sanpham.hansudung)";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                SanPham sanPham = new SanPham(
                        resultSet.getInt("id_sanpham"),
                        resultSet.getFloat("gia"),
                        resultSet.getString("tensanpham"),
                        resultSet.getString("ngaynhap"),
                        resultSet.getString("ngayban"),
                        resultSet.getString("hansudung"),
                        resultSet.getString("mota"),
                        resultSet.getInt("id_danhmuc"),
                        resultSet.getString("tendanhmuc")
                );
                list.add(sanPham);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

public static List<SanPham> hethansudung() {
        List<SanPham> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "SELECT sanpham.*, danhmuc.* FROM `sanpham` inner join danhmuc on sanpham.id_danhmuc = danhmuc.id_danhmuc WHERE (CURDATE() < sanpham.hansudung)";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                SanPham sanPham = new SanPham(
                        resultSet.getInt("id_sanpham"),
                        resultSet.getFloat("gia"),
                        resultSet.getString("tensanpham"),
                        resultSet.getString("ngaynhap"),
                        resultSet.getString("ngayban"),
                        resultSet.getString("hansudung"),
                        resultSet.getString("mota"),
                        resultSet.getInt("id_danhmuc"),
                        resultSet.getString("tendanhmuc")
                );
                list.add(sanPham);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

public static List<SanPham> bantrongngay() {
        List<SanPham> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "SELECT sanpham.*, danhmuc.* FROM `sanpham` inner join danhmuc on sanpham.id_danhmuc = danhmuc.id_danhmuc WHERE (CURDATE() = ngayban)";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                SanPham sanPham = new SanPham(
                        resultSet.getInt("id_sanpham"),
                        resultSet.getFloat("gia"),
                        resultSet.getString("tensanpham"),
                        resultSet.getString("ngaynhap"),
                        resultSet.getString("ngayban"),
                        resultSet.getString("hansudung"),
                        resultSet.getString("mota"),
                        resultSet.getInt("id_danhmuc"),
                        resultSet.getString("tendanhmuc")
                );
                list.add(sanPham);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

public static List<SanPham> bantrongthang() {
        List<SanPham> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "SELECT sanpham.*, danhmuc.* FROM `sanpham` inner join danhmuc on sanpham.id_danhmuc = danhmuc.id_danhmuc WHERE (MONTH(ngaythem) = MONTH(ngayban))";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                SanPham sanPham = new SanPham(
                        resultSet.getInt("id_sanpham"),
                        resultSet.getFloat("gia"),
                        resultSet.getString("tensanpham"),
                        resultSet.getString("ngaynhap"),
                        resultSet.getString("ngayban"),
                        resultSet.getString("hansudung"),
                        resultSet.getString("mota"),
                        resultSet.getInt("id_danhmuc"),
                        resultSet.getString("tendanhmuc")
                );
                list.add(sanPham);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

public static List<SanPham> bantrongtuan() {
        List<SanPham> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "SELECT sanpham.*, danhmuc.* FROM `sanpham` inner join danhmuc on sanpham.id_danhmuc = danhmuc.id_danhmuc WHERE (YEARWEEK(ngaynhap) = YEARWEEK(ngayban))";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                SanPham sanPham = new SanPham(
                        resultSet.getInt("id_sanpham"),
                        resultSet.getFloat("gia"),
                        resultSet.getString("tensanpham"),
                        resultSet.getString("ngaynhap"),
                        resultSet.getString("ngayban"),
                        resultSet.getString("hansudung"),
                        resultSet.getString("mota"),
                        resultSet.getInt("id_danhmuc"),
                        resultSet.getString("tendanhmuc")
                );
                list.add(sanPham);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

public static List<DanhMuc> danhmuc() {
        List<DanhMuc> list12 = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanghoa?serverTimezone=UTC", "root", "");
            String sql = "SELECT * FROM danhmuc";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                DanhMuc dm = new DanhMuc(
                resultSet.getInt("id_danhmuc"),
                resultSet.getString("tendanhmuc")
                );
                list12.add(dm);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamtModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list12;
    }
}
