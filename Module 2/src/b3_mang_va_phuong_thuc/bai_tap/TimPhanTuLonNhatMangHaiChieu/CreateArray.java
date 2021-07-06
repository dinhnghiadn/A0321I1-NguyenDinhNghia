package b3_mang_va_phuong_thuc.bai_tap.TimPhanTuLonNhatMangHaiChieu;

import java.util.Scanner;

public class CreateArray {
    public static int[][] create2DArray(int m, int n){
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        array = new int[m][n];
        for ( int i = 0 ; i < n ; i++){
            for ( int j = 0 ; j < n; j++){
                System.out.println("Enter element A["+i+"]["+j+"]:");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }
}
