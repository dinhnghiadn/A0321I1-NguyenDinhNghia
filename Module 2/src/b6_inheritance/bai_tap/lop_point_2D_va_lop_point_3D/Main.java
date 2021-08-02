package b6_inheritance.bai_tap.lop_point_2D_va_lop_point_3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(20.5f, 30.5f);
        System.out.println(point2D);
        point2D.setXY(10.5f, 20.5f);
        System.out.println(point2D);
        Point3D point3D = new Point3D(3.5f, 6.5f, 9.5f);
        System.out.println(point3D);
        point3D.setXYZ(10f, 20f, 30f);
        System.out.println(point3D);


    }
}
