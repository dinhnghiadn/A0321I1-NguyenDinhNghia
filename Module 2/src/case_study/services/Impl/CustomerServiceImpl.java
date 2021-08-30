package case_study.services.Impl;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.services.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static {
        System.out.println("Khởi tạo danh sách khách hàng...");
    }
    private static List<Customer> customerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer : customerList){
            System.out.println(customer.toString());
        }


    }

    @Override
    public void addNew() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính:");
        String sex = scanner.nextLine();
        System.out.println("Nhập số CMND:");
        String idCard = scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
        String phone = scanner.nextLine();
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng:");
        String typeCustomer = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, age, sex, idCard, phone, email, typeCustomer, address);
        customerList.add(customer);
        System.out.println("Đã thêm mới khách hàng thành công !");

    }

    @Override
    public void edit() {
        System.out.println("Nhập id khách hàng cần chỉnh sửa:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                System.out.println("Nhập thông tin muốn chỉnh sửa:" +
                        "\n 1.Id " +
                        "\n 2.Name " +
                        "\n 3.Age " +
                        "\n 4.Sex " +
                        "\n 5.IdCard " +
                        "\n 6.Phone number " +
                        "\n 7.Email " +
                        "\n 8.Type Customer " +
                        "\n 9.Address ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("Nhập id mới:");
                        int newId = Integer.parseInt(scanner.nextLine());
                        customer.setId(newId);
                        break;
                    case 2:
                        System.out.println("Nhập tên mới:");
                        String name = scanner.nextLine();
                        customer.setName(name);
                        break;
                    case 3:
                        System.out.println("Nhập tuổi mới:");
                        int age = Integer.parseInt(scanner.nextLine());
                        customer.setAge(age);
                        break;
                    case 4:
                        System.out.println("Nhập giới tính mới:");
                        String sex = scanner.nextLine();
                        customer.setSex(sex);
                        break;
                    case 5:
                        System.out.println("Nhập số chứng minh mới:");
                        String idCard = scanner.nextLine();
                        customer.setIdCard(idCard);
                    case 6:
                        System.out.println("Nhập số điện thoại mới:");
                        String phone = scanner.nextLine();
                        customer.setPhone(phone);
                        break;
                    case 7:
                        System.out.println("Nhập email mới:");
                        String email = scanner.nextLine();
                        customer.setEmail(email);
                        break;
                    case 8:
                        System.out.println("Nhập loại khách hàng mới:");
                        String typeCustomer = scanner.nextLine();
                        customer.setTypeCustomer(typeCustomer);
                        break;
                    case 9:
                        System.out.println("Nhập địa chỉ mới:");
                        String address = scanner.nextLine();
                        customer.setAddress(address);
                        break;

                }
            } else System.out.println("Không tìm thấy ID khách hàng!");

        }
    }

    @Override
    public void delete() {

    }
}
