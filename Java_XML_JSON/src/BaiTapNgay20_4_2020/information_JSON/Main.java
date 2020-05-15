/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay20_4_2020.information_JSON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
          FileInputStream fis = null;
        try {
            //Step 1: doc content tu file json.
          
            fis = new FileInputStream("d:/Admin/Documents/XML_JSON/JSON/information.json");

            StringBuilder builder = new StringBuilder();
            //dọc theo từng kí tự trong file json
            int code;
            while ((code = fis.read()) != -1) {
                builder.append((char) code);
            }
            String content = builder.toString();

            //Step 2: Convert du lieu tu JSON to class object (đây là cách convert 1 mảng object)
//            JSONArray array = new JSONArray(content);
//            
//            List<InformationHuanDV> informationHuandvArrayList = new ArrayList<>();
//            for (int i = 0; i < array.length(); i++) {
//                JSONObject obj = array.getJSONObject(i);
//                InformationHuanDV ihdv = new InformationHuanDV();
//                ihdv.convertJSON(obj);
//                informationHuandvArrayList.add(ihdv);
//            }
//            for (InformationHuanDV a : informationHuandvArrayList) {
//                a.display();
//            }
            
            
            
            //Step 2: Convert du lieu tu JSON to class object (đây là cách convert 1 object)
            JSONObject JBO = new JSONObject(content);          // gán giá trị content vừa đọc vào 1 object
            InformationHuanDV ihdv = new InformationHuanDV();      
            ihdv.convertJSON(JBO);                                  // truyền dữ liệu đọc được (JBO) như là 1 object vào thằng ihdv để convert 
            ihdv.display();                                           // hiển thị dữ liệu đã được convert xong

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if (fis !=null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
