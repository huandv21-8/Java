package java_XML.BaiTapNgay15_4_2020.bai1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class StudentHandler extends DefaultHandler {
    List<Student> list = new ArrayList<>();         // khai báo 1 chuỗi Student
    Student std = null;                             // khai báo đối tượng student


    //tạo các biến dạng đúng sai để  gán giá trị lần lượt
    boolean isfullname = false, isage = false, isaddress = false, isemail = false, isrollno = false;


   // đọc dữ liệu từ file xml
    // đọc thẻ mở
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("student")) {           //khi dọc đến  thẻ có tên student
            std = new Student();                                       // thì tạo ra 1 student
        } else if (qName.equalsIgnoreCase("fullname")) {      //khi dọc đến  thẻ có tên fullname
            isfullname = true;
        } else if (qName.equalsIgnoreCase("age")) {            //khi dọc đến  thẻ có tên fullname
            isage = true;
        } else if (qName.equalsIgnoreCase("address")) {           //khi dọc đến  thẻ có tên fullname
            isaddress = true;
        } else if (qName.equalsIgnoreCase("email")) {             //khi dọc đến  thẻ có tên email
            isemail = true;
        } else if (qName.equalsIgnoreCase("roll_no")) {              //khi dọc đến  thẻ có tên roll_no
            isrollno = true;
        }
    }

    // dọc thẻ đóng
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("student")) {               // đọc đến thẻ đóng có tên student
            list.add(std);                                     // thì add giá trị của thằng student vào chuỗi vừa tạo ở trên
            std = null;                                        // add xong thì khai báo lại student = null
        } else if (qName.equalsIgnoreCase("fullname")) {
            isfullname = false;
        } else if (qName.equalsIgnoreCase("age")) {
            isage = false;
        } else if (qName.equalsIgnoreCase("address")) {
            isaddress = false;
        } else if (qName.equalsIgnoreCase("email")) {
            isemail = false;
        } else if (qName.equalsIgnoreCase("roll_no")) {
            isrollno = false;
        }
    }

    // lấy giấ trị đọc được và gán vào  biến của đối tượng
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);              // giá trị đọc được từ file
        if (std != null) {
            if (isfullname) {               // nếu đọc đến thẻ mở có tên fullname trong khi các thẻ khác chưa được đọc
                std.setFullname(value);        // thì lấy giá trị của thẻ và gán vào Fullname của thằng Student
            } else if (isage) {
                std.setAge(Integer.parseInt(value));       // gán dạng số nguyên.
            } else if (isaddress) {
                std.setAddress(value);
            } else if (isemail) {
                std.setEmail(value);
            } else if (isrollno) {
                std.setRollNo(value);
            }
        }
    }

    public void output() {
        for (Student s : list) {     // vòng for chạy qua các tất cả các thằng student
            s.display();               // thục hiện hiển thị thông tin của các thằng student.
        }
    }
}
