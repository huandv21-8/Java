package java1_Basic.ASSIGNMENT.assignment_15p;

public class HinhChuNhat extends Shape{
    float width;
    float height;

    public HinhChuNhat() {
    }

    public HinhChuNhat(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float tinhChuVi(){
        return (float) (2*(width+height));
    }

    @Override
    public float tinhDienTich(){
        return (float) (width*height);
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }



}