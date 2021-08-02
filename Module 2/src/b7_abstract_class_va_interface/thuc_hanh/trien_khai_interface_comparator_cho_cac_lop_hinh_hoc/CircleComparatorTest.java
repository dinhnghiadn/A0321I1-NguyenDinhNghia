package b7_abstract_class_va_interface.thuc_hanh.trien_khai_interface_comparator_cho_cac_lop_hinh_hoc;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
//        System.out.println(circleComparator.compare(circles[0],circles[1])); Test hàm so sánh
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
//        System.out.println(circleComparator.compare(circles[0],circles[1])); Test hàm so sánh
    }
}
