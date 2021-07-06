package b3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static int minValue(int[] array){
        int min = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j;
            }
        }
        return index;
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
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]+ " at position "+index);
    }
}
