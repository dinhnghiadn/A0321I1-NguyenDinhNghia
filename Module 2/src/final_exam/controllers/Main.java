package final_exam.controllers;

import final_exam.Services.BenhAnImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("- CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN-");
            System.out.println("Chọn chức năng theo số để tiếp tục");
            System.out.println("1.Thêm mới");
            System.out.println("2.Xoá");
            System.out.println("3.Xem danh sách bệnh án");
            System.out.println("4.Thoát");
            Scanner scanner = new Scanner(System.in);
            int option = 0;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }
            BenhAnImpl benhAnThuong = new BenhAnImpl();
            switch (option) {
                case 1:
                    addNew();
                    break;
                case 2:
                    benhAnThuong.delete();
                    break;

                case 3:
                    benhAnThuong.display();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.exit(0);

            }

        }
    }

    private static void addNew() {
        Scanner scanner = new Scanner(System.in);
        BenhAnImpl benhAnThuong = new BenhAnImpl();
        System.out.println("Chọn loại bệnh án:");
        System.out.println("1.Vip");
        System.out.println("2.Thường");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                benhAnThuong.addNewVip();
                break;
            case 2:
                benhAnThuong.addNewNormal();
                break;
        }
    }
}
