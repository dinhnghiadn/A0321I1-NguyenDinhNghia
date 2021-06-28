package VongLapTrongJava.BaiTap;
public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("-----Menu design-----");
        System.out.println("1. Draw the triangle.");
        System.out.println("2. Draw the square.");
        System.out.println("3. Draw the rectangle.");
        System.out.println("0. Exit");
        System.out.println("---------------------");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        while (choice != 0) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Draw_the_triangle();
                    break;
                case 2:
                    Draw_the_square();
                    break;
                case 3:
                    Draw_the_rectangle();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
    static void Draw_the_triangle() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("[ Draw the triangle ]");
        System.out.print("Enter n: ");
        int hight = sc.nextInt();
        for (int i = hight; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Draw_the_square() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("[ Draw the square ]");
        System.out.print("Enter a: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Draw_the_rectangle() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("[ Draw the rectangle ]");
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
