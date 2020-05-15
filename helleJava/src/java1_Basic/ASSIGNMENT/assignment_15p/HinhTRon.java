package java1_Basic.ASSIGNMENT.assignment_15p;



public class HinhTRon extends Shape {
    float radius;
    double pi = Math.PI;

    public HinhTRon() {
    }

    public HinhTRon(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float tinhChuVi(){
        return (float) (2*pi*radius);
    }

    @Override
    public float tinhDienTich(){
        return (float) (pi*radius*radius);
    }
}