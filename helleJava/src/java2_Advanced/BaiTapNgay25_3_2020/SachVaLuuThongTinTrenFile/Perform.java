package java2_Advanced.BaiTapNgay25_3_2020.SachVaLuuThongTinTrenFile;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;
import java.util.zip.DeflaterInputStream;

public class Perform {
    Scanner scan = new Scanner(System.in);
    List<Book> list = new ArrayList<>();

    //case1
    public void input() {
        System.out.println("Nhap so cuon sach:");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Book book = new Book();
            book.nhap();
            list.add(book);
        }
    }

    //case2
    public void display() {
        for (Book book1 : list) {
            book1.hienThi();
        }
    }

    //case3
    public void sortAuthor() {
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book book, Book t1) {
                return book.getNameAuthor().compareToIgnoreCase(book.getNameAuthor());
            }
        });
    }

    //case4
    public void saveBook1_Object() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("d:/Admin/Java2_advanced/data.obj");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(list);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //case5
    public void saveBook_buffered() {
        FileOutputStream fos = null;
        BufferedOutputStream bfos = null;
        try {
            fos = new FileOutputStream("d:/Admin/Java2_advanced/data.txt");
            bfos = new BufferedOutputStream(fos);

            for (Book book2 : list) {
                String line = book2.getLine();
                byte[] bytes = line.getBytes("utf-8");
                bfos.write(bytes);
            }

        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bfos != null) {
                try {
                    bfos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //case6
    public void zipFile() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        DeflaterInputStream dis = null;

        try {
            fis = new FileInputStream("d:/Admin/Java2_advanced/data.txt");
            dis = new DeflaterInputStream(fis);
            fos = new FileOutputStream("d:/Admin/Java2_advanced/data.dfl");

            int a;
            while ((a = dis.read()) != -1) {
                fos.write(a);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //case7
    public void showBook1_Object() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("d:/Admin/Java2_advanced/data.obj");
            ois = new ObjectInputStream(fis);

            ArrayList<Book> List = (ArrayList<Book>) ois.readObject();

            for (Book object : List) {
                object.hienThi();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
