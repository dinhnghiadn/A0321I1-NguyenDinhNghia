package b7_abstract_class_va_interface.thuc_hanh.TrienKhaiInterfaceComparableChoCacLopHinhHoc;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5,"indigo",false);
        System.out.println("Pre-sort:");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
//        System.out.println(circles[0].compareTo(circles[1])); test hàm so sánh trước khi sort
        Arrays.sort(circles);
        System.out.println("After-sort:");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
//        System.out.println(circles[0].compareTo(circles[1])); test hàm so sánh sau khi sort
    }
}
