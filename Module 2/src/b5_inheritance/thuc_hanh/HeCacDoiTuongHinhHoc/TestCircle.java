package b5_inheritance.thuc_hanh.HeCacDoiTuongHinhHoc;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);
    }
}
