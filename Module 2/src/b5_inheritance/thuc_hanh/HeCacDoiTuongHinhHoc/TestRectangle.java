package b5_inheritance.thuc_hanh.HeCacDoiTuongHinhHoc;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 2.3, 2.5);
        System.out.println(rectangle);
    }
}
