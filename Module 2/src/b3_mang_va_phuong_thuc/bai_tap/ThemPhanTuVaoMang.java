package b3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    private static int[] insertElement(int array[],
                                       int element, int index) {
        int length = array.length;
        int destination[] = new int[length + 1];
        System.arraycopy(array, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(array, index, destination, index
                + 1, length - index);
        return destination;
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
        System.out.println("Enter position:");
        int index = scanner.nextInt();
        if ( index < 0 || index > array.length ){
            System.out.println("Cannot insert number !");
        } else {
            int[] newArray = insertElement(array,input_number,index);
            System.out.println("After insert:");
            for ( int i = 0; i < newArray.length;i++){
                System.out.print(newArray[i] + " ");
            }
        }

    }
}
