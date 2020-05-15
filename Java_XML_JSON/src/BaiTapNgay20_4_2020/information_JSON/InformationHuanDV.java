/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay20_4_2020.information_JSON;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Admin
 */
public class InformationHuanDV {

    Information infor;               // khai báo 1 đối tượng 
    List<String> hobbies = new ArrayList<>();         //khai báo 1 mảng có kiểu dữ liệu String
    List<String> tools = new ArrayList<>();
    List<String> language = new ArrayList<>();

    public InformationHuanDV() {
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

    public void convertJSON(JSONObject json) {
        // khai báo 1 object và gán giá trị của 1 object được convert từ file json có thẻ là "informatin" vào biến object vừa khai báo
        JSONObject jsonInfor = json.getJSONObject("information");
        infor.convertJSON(jsonInfor);                              //gọi đến hàm convertJSON của class infor 

        
        //khai báo 1 chuỗi và gán giá trị của 1 chuỗi được convert từ file json có thẻ là "hobbies" vào biến hobbiesArray vừa khai báo
        JSONArray hobbiesArray = json.getJSONArray("hobbies");       
        for (int i = 0; i < hobbiesArray.length(); i++) {
            String s = hobbiesArray.getString(i);
            hobbies.add(s);
        }

          //khai báo 1 chuỗi và gán giá trị của 1 chuỗi được convert từ file json có thẻ là "tools" vào biến toolsArray vừa khai báo
        JSONArray toolsArray = json.getJSONArray("tools");
        for (int i = 0; i < toolsArray.length(); i++) {
            String s = toolsArray.getString(i);
            tools.add(s);
        }
        
        //khai báo 1 chuỗi và gán giá trị của 1 chuỗi được convert từ file json có thẻ là "language" vào biến languageArray vừa khai báo
        JSONArray languageArray = json.getJSONArray("languages");
        for (int i = 0; i < languageArray.length(); i++) {
            String s = languageArray.getString(i);
            language.add(s);
        }
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
