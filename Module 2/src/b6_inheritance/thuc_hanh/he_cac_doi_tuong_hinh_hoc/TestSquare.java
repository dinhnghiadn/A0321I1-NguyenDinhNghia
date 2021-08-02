package b6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("yellow", true, 5.8);
        System.out.println(square);
        System.out.println(+square.getPerimeter());
        System.out.println(+square.getArea());
        square.setWidth(10);
        System.out.println(+square.getLength());
    }
}
