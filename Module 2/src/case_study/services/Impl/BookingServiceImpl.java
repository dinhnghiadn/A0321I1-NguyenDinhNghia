package case_study.services.Impl;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.models.Facility;
import case_study.models.Villa;
import case_study.services.BookingService;
import case_study.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap =  new LinkedHashMap<>();
    static {
        customerList.add(new Customer(1,"Nguyen Van A","25","Male","291281111","0905291911",
                "vana@gmail.com","VIP","DaNang"));
        customerList.add(new Customer(2,"Nguyen Van B","30","Male","291231111","0901231911",
                "vanb@gmail.com","NORMAL","HaNoi"));
        facilityIntegerMap.put(new Villa("1","Villa A",200,150,10,
                "Day","Vip",15,3),0);
        facilityIntegerMap.put(new Villa("2","Villa B",300,250,12,
                "Month","Normal",20,4),0);

    }
    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()){
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhập ngày bắt đầu thuê:");
        String startDate = scanner.nextLine();
        System.out.println("Nhập ngày trả phòng:");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id,startDate,endDate,customer,facility);
        bookingSet.add(booking);
        System.out.println("Đã booking thành công!");


    }

    @Override
    public void displayListBooking() {
        for (Booking booking : bookingSet){
            System.out.println(booking.toString());
        }

    }
    public static Customer chooseCustomer(){
        System.out.println("Danh sách khách hàng:");
        for (Customer customer : customerList){
            System.out.println(customer);
        }
        System.out.println("Nhập id khách hàng:");
        boolean check = true;
        int id = 0;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
        while (check){
            for (Customer customer : customerList){
                if (id == customer.getId()){
                    check = false;
                    return customer;
                }
            }
            if (check){
                System.out.println("Bạn đã nhập sai, vui lòng nhập lại id khách hàng:");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility(){
        System.out.println("Danh sách dịch vụ:");
        for (Map.Entry<Facility,Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Nhập id dịch vụ:");
        boolean check = true;
        String id = scanner.nextLine();
        while (check){
            for (Map.Entry<Facility,Integer> entry : facilityIntegerMap.entrySet()){
                if (id.equals(entry.getKey().getIdFacility())){
                    check = false;
                    return entry.getKey();
                }
            }
            if (check){
                System.out.println("Bạn đã nhập sai, vui lòng nhập lại id dịch vụ:");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    public Set<Booking> sendBooking(){
        return bookingSet;
    }
}
