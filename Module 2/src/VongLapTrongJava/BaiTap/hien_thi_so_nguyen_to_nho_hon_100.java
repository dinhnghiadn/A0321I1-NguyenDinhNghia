package VongLapTrongJava.BaiTap;

public class hien_thi_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        System.out.print("Các số nguyên tố nhỏ hơn 100: ");
        int n = 2;
        while (n<100){
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(+n+",");
            }
            n++;

        }

    }
}
