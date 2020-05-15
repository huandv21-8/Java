package BaiTapNgay11_3_2020.OnLuyenKt60p.Bai3;

public class Bai3 {
    String nameBook, nameAuthor, producer, dateTime;

    public Bai3() {
    }

    public Bai3(String nameBook, String nameAuthor, String producer, String dateTime) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.producer = producer;
        this.dateTime = dateTime;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


    @Override
    public String toString() {
        return "Bai3{" +
                "nameBook='" + nameBook + '\'' +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", producer='" + producer + '\'' +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
