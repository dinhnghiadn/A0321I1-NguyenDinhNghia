package case_study.services.Impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static {
        System.out.println("Khởi tạo danh sách nhân viên...");
    }
    static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        for (Employee employee : employeeList){
            System.out.println(employee.toString());
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
        System.out.println("Nhập trình độ:");
        String level = scanner.nextLine();
        System.out.println("Nhập vị trí:");
        String position = scanner.nextLine();
        System.out.println("Nhập lương:");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(id,name,age,sex,idCard,phone,email,level,position,salary);
        employeeList.add(employee);
        System.out.println("Đã thêm mới nhân viên thành công !");


    }

    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên cần chỉnh sửa:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employeeList){
            if (employee.getId() == id){
                System.out.println("Nhập thông tin muốn chỉnh sửa:" +
                        "\n 1.Id "+
                        "\n 2.Name "+
                        "\n 3.Age "+
                        "\n 4.Sex "+
                        "\n 5.IdCard "+
                        "\n 6.Phone number "+
                        "\n 7.Email " +
                        "\n 8.Level " +
                        "\n 9.Position " +
                        "\n 10.Salary ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("Nhập id mới:");
                        int newId = Integer.parseInt(scanner.nextLine());
                        employee.setId(newId);
                        break;
                    case 2:
                        System.out.println("Nhập tên mới:");
                        String name = scanner.nextLine();
                        employee.setName(name);
                        break;
                    case 3:
                        System.out.println("Nhập tuổi mới:");
                        int age = Integer.parseInt(scanner.nextLine());
                        employee.setAge(age);
                        break;
                    case 4:
                        System.out.println("Nhập giới tính mới:");
                        String sex = scanner.nextLine();
                        employee.setSex(sex);
                        break;
                    case 5:
                        System.out.println("Nhập số chứng minh mới:");
                        String idCard = scanner.nextLine();
                        employee.setIdCard(idCard);
                    case 6:
                        System.out.println("Nhập số điện thoại mới:");
                        String phone = scanner.nextLine();
                        employee.setPhone(phone);
                        break;
                    case 7:
                        System.out.println("Nhập email mới:");
                        String email = scanner.nextLine();
                        employee.setEmail(email);
                        break;
                    case 8:
                        System.out.println("Nhập trình độ mới:");
                        String level = scanner.nextLine();
                        employee.setLevel(level);
                        break;
                    case 9:
                        System.out.println("Nhập vị trí mới:");
                        String position = scanner.nextLine();
                        employee.setPosition(position);
                        break;
                    case 10:
                        System.out.println("Nhập lương mới:");
                        int salary = Integer.parseInt(scanner.nextLine());
                        employee.setSalary(salary);
                        break;

                }
            } else System.out.println("Không tìm thấy ID nhân viên!");
        }


    }

    @Override
    public void delete() {

    }
}
