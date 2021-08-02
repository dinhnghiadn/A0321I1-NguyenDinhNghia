package b6_inheritance.bai_tap.lop_circle_va_lop_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"red");
        System.out.println(circle);
        System.out.println("Diện tích hình tròn: "+circle.getArea());
        Cylinder cylinder = new Cylinder(10,"blue",15);
        System.out.println(cylinder);;
        System.out.println("Thể tích hình trụ: "+cylinder.getVolume());
    }
}
