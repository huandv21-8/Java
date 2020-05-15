/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay20_4_2020.information_GSON;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class InformationHUANDV {
    @SerializedName("information")
    Information infor;               // khai báo 1 đối tượng 
    
    List<String> hobbies = new ArrayList<>();         //khai báo 1 mảng có kiểu dữ liệu String
    List<String> tools = new ArrayList<>();
    List<String> language = new ArrayList<>();

    public InformationHUANDV() {
        infor = new Information();
    }

    public Information getInfor() {
        return infor;
    }

    public void setInfor(Information infor) {
        this.infor = infor;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getTools() {
        return tools;
    }

    public void setTools(List<String> tools) {
        this.tools = tools;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

  

    public void display() {              // hàm hiển thị thông tin
        System.out.println("Thong tin: ");
        System.out.println(infor);

        for (String hobby : hobbies) {
            System.out.print("So thich: ");
            System.out.println(hobby);
        }

        for (String tool : tools) {
            System.out.print("dung cu hoc tap: ");
            System.out.println(tool);
        }
        
         for (String language : language) {
            System.out.print("Ngon ngu lap trinh yeu thich: ");
            System.out.println(language);
        }
    }

}
