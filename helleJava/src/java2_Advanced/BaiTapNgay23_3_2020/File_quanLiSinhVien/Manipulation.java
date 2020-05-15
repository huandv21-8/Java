package java2_Advanced.BaiTapNgay23_3_2020.File_quanLiSinhVien;


import java.io.*;
import java.util.*;


public class Manipulation {
    Scanner scanner = new Scanner(System.in);

    List<Student> list = new ArrayList<>();

    public void addStudent() {
        System.out.print("Nhap so sinh vien can them: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.input();
            list.add(student);
        }
    }

    public void editStudent() {
        System.out.println("Nhap id cua hoc sinh can sua: ");
        String id = scanner.nextLine();
        for (Student edit : list) {
            if (edit.id.equalsIgnoreCase(id)) {    // tìm id của sinh viên trong mảng
                edit.input();                        // tìm được thì sẽ nhập lại thông tin cho sinh viên đó.
            } else {
                System.out.println("Khon tim thay sinh vien co id: " + id);
            }
        }
    }

    public void deleteStudent() {
        System.out.println("Nhap id cua hoc sinh can xóa: ");
        String id = scanner.nextLine();
        for (Student edit : list) {
            if (edit.id.equalsIgnoreCase(id)) {           // tìm id của sinh viên trong mảng
                list.remove(edit);                     // tìm được thì sẽ xóa thông tin cho sinh viên đó khỏi mảng.
            }
        }
    }

    public void sortStudent_gpa() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                if (student.gpa > t1.gpa) {                    //so sanh điểm và sắp xếp theo chiều tăng dần.
                    return 1;
                }
                return -1;
            }
        });
    }

    public void sortStudent_name() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getName().compareToIgnoreCase(t1.getName());  //sắp xếp tên từ a -> z.
            }
        });
    }

    public void display() {
        for (Student hienthi : list) {
            hienthi.output();                  // hiển thị thông tin sinh viên trong mảng.
        }
    }


    public void saveStudent() {
        FileOutputStream fos = null;                         // khai báo nhập dữ liệu vào cho file
        ObjectOutputStream oos = null;                      // khai báo nhập dữ liệu vào cho đối tượng
        try {
            fos = new FileOutputStream("student.txt");   //tạo 1 file có tên là student.txt
            oos = new ObjectOutputStream(fos);

            oos.writeObject(list);               // truyền dữ liệu vào cho file

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();                 // đóng ....         (bắt buộc phải đóng nếu như có dữ liệu truyền vào)
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();                 // đóng ....         (bắt buộc phải đóng nếu như có dữ liệu truyền vào)
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void showStudent() {
        FileInputStream fis = null;                   // khai báo hiển thị dữ liệu của file
        ObjectInputStream ois = null;                  // khai báo hiển thị dữ liệu của đối tượng.
        try {
            fis = new FileInputStream("student.txt");
            ois = new ObjectInputStream(fis);

            Object obj = ois.readObject();                            // gọi ra dữ liệu và gán vào Object
            System.out.println(obj);                                // hiển thị dữ liệu trên màng hình.

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
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Nothing !!!");
            }
        }
    }
}
