package b15_exception_and_debug.bai_tap.su_dung_lop_IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter size 1");
            int size1 = scanner.nextInt();
            System.out.println("Enter size 2");
            int size2 = scanner.nextInt();
            System.out.println("Enter size 3");
            int size3 = scanner.nextInt();
            Triangle triangle = new Triangle(size1,size2,size3);
        } catch (TamGiacException e) {
            e.printStackTrace();
        }
        System.out.println("End");


    }
}
