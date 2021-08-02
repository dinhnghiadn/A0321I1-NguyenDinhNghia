package b4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        a = sc.nextDouble();
        System.out.println("Input a:");
        b = sc.nextDouble();
        System.out.println("Input a:");
        c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() >= 0) {
            if (quadraticEquation.getDiscriminant() == 0){
                System.out.println("The equation has one root: " + quadraticEquation.getRoot1());
            }
            else System.out.println("The equation has two roots: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else System.out.println("The equation has no real roots!");
    }
}
