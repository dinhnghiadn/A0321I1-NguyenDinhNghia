package b3_mang_va_phuong_thuc.bai_tap.Gop_Mang;

import java.util.Scanner;

public class CreateArray {
     static int[] createArray(){
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int m = 0;
        while (m < array.length) {
            System.out.print("Enter element " + (m + 1) + ": ");
            array[m] = scanner.nextInt();
            m++;
        }
        return array;
    }
}
