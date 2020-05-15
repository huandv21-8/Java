package BaiTapNgay17_4_2020_fileXML.information;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;


public class Handler extends DefaultHandler {
    List<Personal_Information> perInfoList = new ArrayList<>();
    Personal_Information perinfo = null;

    boolean ispersonal_Information = false, isname = false, isage = false, isaddress = false, isgender = false,
            ishobby = false, istool = false, islanguage = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("Information")) {
            perinfo = new Personal_Information();
        } else if (qName.equalsIgnoreCase("personal_Information")) {
            ispersonal_Information = true;
            Information in = new Information();
            perinfo.setInfor(in);
        } else if (qName.equalsIgnoreCase("name")) {
            isname = true;
        } else if (qName.equalsIgnoreCase("age")) {
            isage = true;
        } else if (qName.equalsIgnoreCase("gender")) {
            isgender = true;
        } else if (qName.equalsIgnoreCase("address")) {
            isaddress = true;
        } else if (qName.equalsIgnoreCase("hobby")) {
            ishobby = true;
        } else if (qName.equalsIgnoreCase("tool")) {
            istool = true;
        } else if (qName.equalsIgnoreCase("language")) {
            islanguage = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Information")) {
            perInfoList.add(perinfo);
            perinfo = null;
        } else if (qName.equalsIgnoreCase("personal_Information")) {
            ispersonal_Information = false;
        } else if (qName.equalsIgnoreCase("name")) {
            isname = false;
        } else if (qName.equalsIgnoreCase("age")) {
            isage = false;
        } else if (qName.equalsIgnoreCase("gender")) {
            isgender = false;
        } else if (qName.equalsIgnoreCase("address")) {
            isaddress = false;
        } else if (qName.equalsIgnoreCase("hobby")) {
            ishobby = false;
        } else if (qName.equalsIgnoreCase("tool")) {
            istool = false;
        } else if (qName.equalsIgnoreCase("language")) {
            islanguage = false;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        if (isname) {
            perinfo.getInfor().setName(value);
        } else if (isage) {
            perinfo.getInfor().setAge(Integer.parseInt(value));
        } else if (isgender) {
            perinfo.getInfor().setGender(value);
        } else if (isaddress) {
            perinfo.getInfor().setAddRess(value);
        } else if (ishobby) {
            perinfo.getListHobbies().add(value);
        } else if (istool) {
            perinfo.getListTools().add(value);
        } else if (islanguage) {
            perinfo.getListProgramming_language().add(value);
        }
    }

//    public void display() {
//        for (Personal_Information p : perInfoList) {
//            p.display();
//        }
//    }
}
