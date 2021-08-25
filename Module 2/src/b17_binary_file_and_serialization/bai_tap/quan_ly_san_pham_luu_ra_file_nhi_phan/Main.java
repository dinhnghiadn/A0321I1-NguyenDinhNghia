package b17_binary_file_and_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src\\b17_binary_file_and_serialization\\bai_tap\\quan_ly_san_pham_luu_ra_file_nhi_phan\\Demo.dat"); // Tao file moi Demo
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Product p1 = new Product("J1","Galaxy","Samsung",10000000,"notRelease");
            System.out.println(p1.toString());
            objectOutputStream.writeObject(p1);
            objectOutputStream.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();}
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
