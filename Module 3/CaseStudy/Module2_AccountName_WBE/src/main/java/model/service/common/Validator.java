package model.service.common;

import model.repositories.CustomerRepository;
import model.repositories.impl.CustomerRepoImpl;

public class Validator {
    static CustomerRepository customerRepository = new CustomerRepoImpl();

    public static String validateName(String name) {
        String message = null;
        String regex = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
        if (!name.matches(regex)) {
            message = "Tên không đúng định dạng";
        }
//        else if (customerRepository.findByName(name) != null) {
//            message = "Tên không được trùng";
//        }
        return message;
    }
    public static String validatePrice(double price){
        String message = null;
        if (price <0){
            message = "Giá phải là số dương";
        }
        return message;
    }
    public static String validateEmail(String email) {
        String message = null;
        String regex = "/^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$/";
        if (!email.matches(regex)) {
            message = " Email không đúng định dạng";
        }
        return message;
    }
    public static String validatePhone(String phone) {
        String message = null;
        String regex = "^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)+([\\d]{7})";
        if (!phone.matches(regex)) {
            message = " SDT không đúng định dạng";
        }
        return message;
    }
    public static String validateService(String service) {
        String message = null;
        String regex = "(DV\\-)[\\d]{4}";
        if (!service.matches(regex)) {
            message = " Dịch vụ không đúng định dạng";
        }
        return message;
    }
}
