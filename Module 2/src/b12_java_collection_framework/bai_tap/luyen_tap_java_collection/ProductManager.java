package b12_java_collection_framework.bai_tap.luyen_tap_java_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static List<Product> productList;
    private static Scanner scanner = new Scanner(System.in);

    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "iphone", 100));
        productList.add(new Product(2, "samsung", 150));
        productList.add(new Product(3, "nokia", 200));
    }

    public static void displayMenu() {
        do {
            System.out.println("Please enter choice: \n" +
                    "1. Display product list \n" +
                    "2. Add product \n" +
                    "3. Update product \n" +
                    "4. Delete product \n" +
                    "5. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }

    public static void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
    public static void addProduct() {
        int id;
        do {
            System.out.println("Enter ID:");
            id = Integer.parseInt(scanner.nextLine());
        } while (findByID(id) != null);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter price:");
        double price = Double.parseDouble(scanner.nextLine());
        productList.add(new Product(id,name,price));
    }
    public static Product findByID(int id){
        for (Product product : productList){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }
    public static void updateProduct(){
        System.out.println("Enter ID:");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = findByID(id);
        if (product != null) {
            System.out.println("Please enter information need to update: \n" +
                    "1. Name product \n" +
                    "2. Price product \n" +
                    "3. Back to menu");
            int choice =  Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter new name:");
                    String name = scanner.nextLine();
                    product.setNameProduct(name);
                    displayMenu();
                    break;
                case 2:
                    System.out.println("Enter new price:");
                    double price = Double.parseDouble(scanner.nextLine());
                    product.setPrice(price);
                    displayMenu();
                    break;
                case 3:
                    displayMenu();
                    break;

            }
        } else System.out.println("Id not found !");
        updateProduct();
    }
    public static void deleteProduct(){
        System.out.println("Enter ID:");
        int id = Integer.parseInt(scanner.nextLine());
        productList.remove(findByID(id));

    }

}
