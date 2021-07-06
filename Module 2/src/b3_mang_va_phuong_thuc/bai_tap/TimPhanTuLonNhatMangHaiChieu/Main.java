package b3_mang_va_phuong_thuc.bai_tap.TimPhanTuLonNhatMangHaiChieu;

public class Main {
    public static void main(String[] args) {
        int[][] array1 = CreateArray.create2DArray(3,3);
        System.out.printf("Min value is: " +MinValue.minValue(array1,3,3));
    }
}
