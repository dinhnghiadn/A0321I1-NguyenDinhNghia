package Introduction_to_Java.Bai_tap;
import java.util.Scanner;

public class Chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tỉ giá hiện hành là 23.025VNĐ/USD");
        System.out.println("Nhập vào số tiền USD cần đổi: ");
        double usd = sc.nextDouble();
        System.out.println("Số tiền VNĐ tương ứng: "+usd*23025 + " VNĐ");
    }
}
