package java_XML.BaiTapNgay20_4_2020.information;

import java.util.ArrayList;
import java.util.List;

public class InformationHuanDV {
    Information information;
    List<String> tools = new ArrayList<>();
    List<String> languages = new ArrayList<>();
    List<String> hobbies = new ArrayList<>();

    public InformationHuanDV() {
    }

    public InformationHuanDV(Information information, List<String> tools, List<String> languages, List<String> hobbies) {
        this.information = information;
        this.tools = tools;
        this.languages = languages;
        this.hobbies = hobbies;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public List<String> getTools() {
        return tools;
    }

    public void setTools(List<String> tools) {
        this.tools = tools;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
