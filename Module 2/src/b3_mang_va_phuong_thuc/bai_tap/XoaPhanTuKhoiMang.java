package b3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    static int delete(int[] array, int pos) {
        for (int i = pos; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        return array.length - 1;
    }
    public static void main(String[] args) {
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
        System.out.println("Enter number:");
        int input_number = scanner.nextInt();
        int index = 0;
        boolean isExist = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input_number) {
                System.out.println("Found number " + input_number + " at position: " + (i));
                index = i;
                isExist = true;
                break;
            }
        }
        if (isExist) {
            int n = delete(array,index);
            System.out.println("After delete: ");
            for (int i = 0; i < n; i++)
                System.out.print(array[i] + " ");

        } else System.out.println("Number not found!");

    }
}
