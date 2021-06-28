package VongLapTrongJava.BaiTap;

import java.util.Scanner;

public class hien_thi_20_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra:");
        int numbers = sc.nextInt();
        int count = 0;
        int n = 2;
        System.out.print(+numbers+" số nguyên tố đầu tiên là: ");
        while (count < numbers){
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(+n+",");
                count++;
            }
            n++;

        }

    }
}
