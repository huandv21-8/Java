package java_XML.BaiTapNgay15_4_2020.AptechClass;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class HandlerClass extends DefaultHandler {
    List<Class> classList = new ArrayList<>();
    Class aClass = null;
    Student student = null;

    Boolean isClassname = false, isTeacher = false, isClassAddress = false,
            isName = false, isAge = false, isGender = false, isAddres = false, isStudent = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("class")) {
            aClass = new Class();
        } else if (qName.equalsIgnoreCase("className")) {
            isClassname = true;
        } else if (qName.equalsIgnoreCase("teacher")) {
            Teacher teacher = new Teacher();
            aClass.setTeacher(teacher);
            isTeacher = true;
        } else if (qName.equalsIgnoreCase("name")) {
            isName = true;
        } else if (qName.equalsIgnoreCase("age")) {
            isAge = true;
        } else if (qName.equalsIgnoreCase("gender")) {
            isGender = true;
        } else if (qName.equalsIgnoreCase("address")) {
            isAddres = true;
        } else if (qName.equalsIgnoreCase("addressClass")) {
            isClassAddress = true;
        } else if (qName.equalsIgnoreCase("studentInformation")) {
            isStudent = true;
            student = new Student();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("class")) {
            classList.add(aClass);
            aClass = null;
        } else if (qName.equalsIgnoreCase("className")) {
            isClassname = false;
        } else if (qName.equalsIgnoreCase("teacher")) {
            isTeacher = false;
        } else if (qName.equalsIgnoreCase("name")) {
            isName = false;
        } else if (qName.equalsIgnoreCase("age")) {
            isAge = false;
        } else if (qName.equalsIgnoreCase("gender")) {
            isGender = false;
        } else if (qName.equalsIgnoreCase("address")) {
            isAddres = false;
        } else if (qName.equalsIgnoreCase("addressClass")) {
            isClassAddress = false;
        } else if (qName.equalsIgnoreCase("studentInformation")) {
            isStudent = false;
            aClass.getStudentList().add(student);
            student = null;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        if (isClassname) {
            aClass.setClassname(value);
        } else if (isName) {
            if (isTeacher) {
                aClass.getTeacher().setName(value);
            } else if (isStudent) {
                student.setName(value);
            }
        } else if (isAge) {
            if (isTeacher) {
                aClass.getTeacher().setAge(Integer.parseInt(value));
            } else if (isStudent) {
                student.setAge(Integer.parseInt(value));
            }
        } else if (isGender) {
            if (isTeacher) {
                aClass.getTeacher().setGender(value);
            } else if (isStudent) {
                student.setGender(value);
            }
        } else if (isAddres) {
            if (isTeacher) {
                aClass.getTeacher().setAddress(value);
            } else if (isStudent) {
                student.setAddress(value);
            }
        } else if (isClassAddress) {
            aClass.setAddressclass(value);
        }
    }

    public void display() {
        for (Class c : classList) {
            c.output();
        }
    }
}
