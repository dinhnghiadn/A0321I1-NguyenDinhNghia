package b3_mang_va_phuong_thuc.bai_tap.tim_phan_tu_lon_nhat_mang_hai_chieu;

public class Main {
    public static void main(String[] args) {
        int[][] array1 = CreateArray.create2DArray(3,3);
        System.out.printf("Min value is: " +MinValue.minValue(array1,3,3));
    }
}
