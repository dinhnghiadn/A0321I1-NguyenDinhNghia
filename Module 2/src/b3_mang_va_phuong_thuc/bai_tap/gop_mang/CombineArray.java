package b3_mang_va_phuong_thuc.bai_tap.gop_mang;

public class CombineArray {
    public static int[] CombineArray(int array1[],
                                       int array2[]) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] tempArr = new int[length1+length2];
        System.arraycopy(array1, 0, tempArr, 0, length1);
        System.arraycopy(array2, 0, tempArr, length1, length2);
        return tempArr;
    }
}
