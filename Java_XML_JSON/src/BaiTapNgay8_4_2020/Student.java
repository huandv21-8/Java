/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay8_4_2020;

/**
 *
 * @author Admin
 */
public class Student {
    int id;
    String fullname, gender, email,address;

    public Student() {
    }

    public Student(int id, String fullname, String gender, String email, String address) {
        this.id = id;
        this.fullname = fullname;
        this.gender = gender;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  void display(){
        System.out.println("id:"+id);
        System.out.println("name: "+fullname);
        System.out.println("gender: "+gender);
        System.out.println("email: "+ email);
        System.out.println("address: "+ address);
    }
}
