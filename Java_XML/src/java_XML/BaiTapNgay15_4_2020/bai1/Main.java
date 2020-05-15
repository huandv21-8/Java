package java_XML.BaiTapNgay15_4_2020.bai1;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // đọc dữ liệu từ file
            FileInputStream fis = new FileInputStream("XML_JSON/information2.xml");
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();

            StudentHandler stdhandler = new StudentHandler();
            saxParser.parse(fis, stdhandler);       // đọc dữ liệu được sử lý theo class StudentHandler

            stdhandler.output();  // hiển thị dữ liệu ra màn hình

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
