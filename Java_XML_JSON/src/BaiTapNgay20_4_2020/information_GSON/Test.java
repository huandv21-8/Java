/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapNgay20_4_2020.information_GSON;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Test {

    public static void main(String[] args) {

        FileReader fir = null;
        try {
            fir = new FileReader("d:/Admin/Documents/XML_JSON/JSON/information.json");
            Gson gson = new Gson();
            
            // trường hợp đọc dữ liệu của 1 chuỗi các object            
            Type class1 = new TypeToken<ArrayList<InformationHUANDV>>(){}.getType();            
            ArrayList<InformationHUANDV> list = gson.fromJson(fir, class1);
            for (InformationHUANDV list1 : list) {
                list1.display();
            }
            
            // trường hợp đọc dữ liệu của 1 object
          //  gson.fromJson(fir, InformationHUANDV.class).display();
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fir != null) {
                try {
                    fir.close();
                } catch (IOException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
