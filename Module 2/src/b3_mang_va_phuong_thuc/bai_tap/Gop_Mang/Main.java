package b3_mang_va_phuong_thuc.bai_tap.Gop_Mang;

public class Main {
    public static void main(String[] args) {
    int[] array1 = CreateArray.createArray();
    int[] array2 = CreateArray.createArray();
    int[] array3 = CombineArray.CombineArray(array1,array2);
        System.out.println("Combine Array:");
        for ( int i = 0; i < array3.length;i++){
            System.out.print(array3[i] + " ");
        }


    }
}
