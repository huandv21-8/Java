package java_XML.BaiTapNgay15_4_2020.personal_information;

public class Information {
    String name,gender, addRess;
    int age;

    public Information(String name, String gender, String addRess, int age) {
        this.name = name;
        this.gender = gender;
        this.addRess = addRess;
        this.age = age;
    }

    public Information() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", addRess='" + addRess + '\'' +
                ", age=" + age +
                '}';
    }
}
