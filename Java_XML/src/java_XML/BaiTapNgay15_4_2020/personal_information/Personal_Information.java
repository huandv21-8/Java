package java_XML.BaiTapNgay15_4_2020.personal_information;

import java.util.ArrayList;
import java.util.List;

public class Personal_Information {

    Information infor;
    List<String> listHobbies = new ArrayList<>();
    List<String> listTools = new ArrayList<>();
    List<String> listProgramming_language = new ArrayList<>();


    public Information getInfor() {
        return infor;
    }

    public void setInfor(Information infor) {
        this.infor = infor;
    }

    public List<String> getListHobbies() {
        return listHobbies;
    }

    public void setListHobbies(List<String> listHobbies) {
        this.listHobbies = listHobbies;
    }

    public List<String> getListTools() {
        return listTools;
    }

    public void setListTools(List<String> listTools) {
        this.listTools = listTools;
    }

    public List<String> getListProgramming_language() {
        return listProgramming_language;
    }

    public void setListProgramming_language(List<String> listProgramming_language) {
        this.listProgramming_language = listProgramming_language;
    }

    public void display() {
        System.out.println(infor);
        System.out.print("Hobbies: ");
        for (String hobbies : listHobbies) {
            System.out.println(hobbies);
        }

        System.out.print("Tools: ");
        for (String tools : listTools) {
            System.out.println(tools);
        }

        System.out.print("Programming Language: ");
        for (String language : listProgramming_language) {
            System.out.println(language);
        }
    }


}
