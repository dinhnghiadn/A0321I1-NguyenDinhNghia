package case_study.services.Impl;

import case_study.models.*;
import case_study.services.FacilityService;
import case_study.utils.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {

    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";

    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility,Integer> element : facilityIntegerMap.entrySet()){
            System.out.println("Service: " +element.getKey() + " Số lần đã thuê: " + element.getValue());
        }

    }

    @Override
    public void displayMaintaince() {

    }

    @Override
    public void addNewVilla() {
        String idFacility = inputId();
        String nameService = inputName();

        double areaUse = Double.parseDouble(inputArea());
        int rentalPrice = Integer.parseInt(inputPrice());

        System.out.println("Nhập số người tối đa:");
        int rentalPeoplemax = 0;
        try {
            rentalPeoplemax = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
        System.out.println("Nhập kiểu thuê:");
        String styleRental = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng:");
        String standardVilla = scanner.nextLine();
        System.out.println("Nhập số tầng:");
        int floor = Integer.parseInt(scanner.nextLine());
        double areaPool = Double.parseDouble(inputArea());

        Villa villa = new Villa(idFacility,nameService,areaUse,rentalPrice,rentalPeoplemax,styleRental,standardVilla,areaPool,floor);
        facilityIntegerMap.put(villa,0);
        System.out.println("Đã thêm mới Villa thành công !");

    }

    private String inputId(){
        System.out.println("Nhập id, mã dịch vụ:");
        return RegexData.regexStr(scanner.nextLine(),REGEX_ID_VILLA,"Bạn đã nhập sai định dạng, mã dịch vụ phải có dạng SVVL-XXXX");
    }
    private String inputName(){
        System.out.println("Nhập tên dịch vụ:");
        return RegexData.regexStr(scanner.nextLine(),REGEX_STR,"Bạn đã nhập sai định dạng, tên dịch vụ phải viết hoa chữ cái đầu");
    }
    private String inputArea(){
        System.out.println("Nhập diện tích dịch vụ:");
        return RegexData.regexStr(scanner.nextLine(),REGEX_AREA,"Bạn đã nhập sai định dạng, diện tích phải lớn hơn 30");
    }
    private String inputPrice(){
        System.out.println("Nhập giá tiền:");
        return RegexData.regexStr(scanner.nextLine(),REGEX_INT,"Bạn đã nhập sai định dạng, giá tiền phải là số dương");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập id:");
        String idFacility = scanner.nextLine();
        System.out.println("Nhập tên:");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích:");
        double areaUse = 0;
        try {
            areaUse = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
        System.out.println("Nhập giá thuê:");
        int rentalPrice = 0;
        try {
            rentalPrice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
        System.out.println("Nhập số người tối đa:");
        int rentalPeoplemax = 0;
        try {
            rentalPeoplemax = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
        System.out.println("Nhập kiểu thuê:");
        String styleRental = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn nhà:");
        String standardHouse = scanner.nextLine();
        System.out.println("Nhập số tầng:");
        int floor = 0;
        try {
            floor = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
        House house = new House(idFacility,nameService,areaUse,rentalPrice,rentalPeoplemax,styleRental,standardHouse,floor);
        facilityIntegerMap.put(house,0);
        System.out.println("Đã thêm mới House thành công !");

    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập id:");
        String idFacility = scanner.nextLine();
        System.out.println("Nhập tên:");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích:");
        double areaUse = 0;
        try {
            areaUse = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
        System.out.println("Nhập giá thuê:");
        int rentalPrice = 0;
        try {
            rentalPrice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
        System.out.println("Nhập số người tối đa:");
        int rentalPeoplemax = 0;
        try {
            rentalPeoplemax = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
        System.out.println("Nhập kiểu thuê:");
        String styleRental = scanner.nextLine();
        System.out.println("Nhập dịch vụ miễn phí:");
        String freeService = scanner.nextLine();
        Room room = new Room(idFacility,nameService,areaUse,rentalPrice,rentalPeoplemax,styleRental,freeService);
        facilityIntegerMap.put(room,0);
        System.out.println("Đã thêm mới Room thành công !");

    }
}
