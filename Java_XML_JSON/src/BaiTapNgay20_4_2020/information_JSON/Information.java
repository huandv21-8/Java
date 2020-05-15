/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay20_4_2020.information_JSON;

import org.json.JSONObject;

/**
 *
 * @author Admin
 */
public class Information {
      String name,gender, addRess;
    int age;

    public Information(String name, String gender, String addRess, int age) {
        this.name = name;
        this.gender = gender;
        this.addRess = addRess;
        this.age = age;
    }

    public Information() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void convertJSON(JSONObject json){               // khai báo 1 JSONobject và  convert dữ liệu từ file json và gán vào biến của object
        name = json.getString("name");                       // convert dữ liệu là 1 chuỗi của thằng có thẻ "name" và gán vào biến name
        age = json.getInt("age");                               // convert dữ liệu là 1 số nguyên của thằng có thẻ "name" và gán vào biến name
        gender = json.getString("gender");
        addRess = json.getString("address");
    }


    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", addRess='" + addRess + '\'' +
                ", age=" + age +
                '}';
    }
}
