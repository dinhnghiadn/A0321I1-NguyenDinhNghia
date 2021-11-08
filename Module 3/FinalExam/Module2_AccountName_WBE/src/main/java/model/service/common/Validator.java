package model.service.common;

public class Validator {
//    static CustomerRepository customerRepository = new CustomerRepoImpl();

    public static String validateTenBenhAn(String name) {
        String message = null;
        String regex = "^[_A-z0-9]*((-|\\s)*[_A-z0-9])*$";
        if (!name.matches(regex)) {
            message = "Tên bệnh án không đúng định dạng";
        }
        return message;
    }
    public static String validateTenBenhNhan(String name) {
        String message = null;
        String regex = "[^0-9]";
        if (!name.matches(regex)) {
            message = "Tên bệnh nhân không đúng định dạng";
        }
        return message;
    }
//    public static String validateEmail(String email) {
//        String message = null;
//        String regex = "/^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$/";
//        if (!email.matches(regex)) {
//            message = " Email không đúng định dạng";
//        }
//        return message;
//    }
//    public static String validatePhone(String phone) {
//        String message = null;
//        String regex = "^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)+([\\d]{7})";
//        if (!phone.matches(regex)) {
//            message = " SDT không đúng định dạng";
//        }
//        return message;
//    }
//    public static String validateService(String service) {
//        String message = null;
//        String regex = "(DV\\-)[\\d]{4}";
//        if (!service.matches(regex)) {
//            message = " Dịch vụ không đúng định dạng";
//        }
//        return message;
//    }
}
