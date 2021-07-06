package b3_mang_va_phuong_thuc.bai_tap.TimPhanTuLonNhatMangHaiChieu;

public class MinValue {
    public static int minValue (int[][] array, int m, int n){
        int min = array[0][0];
        for (int i = 0; i < m ; i++){
            for (int j = 0; j < n ; j++){
                if (array[i][j] < min){
                    min = array[i][j];
                }

            }
        }
        return min;
    }
}
