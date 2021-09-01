package case_study.services.Impl;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;
import case_study.services.ContractService;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {

            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("Đang tạo hợp đồng cho booking có thông tin: " + booking.toString());
            System.out.println("Đang tạo hợp đồng cho customer có thông tin: " + customer.toString());
            System.out.println("Nhập id hợp đồng:");
            int id = 0;
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }
            System.out.println("Nhập số tiền trả trước:");
            String pre = scanner.nextLine();
            System.out.println("Nhập số tiền phải trả:");
            String pay = scanner.nextLine();
            Contract contract = new Contract(id, booking.getIdBooking(), pre, pay, customer.getId());
            contractList.add(contract);
            System.out.println("Đã tạo hợp đồng thành công !" + contract.toString());
        }

    }

    @Override
    public void displayListContract() {
        for (Contract contract : contractList){
            System.out.println(contract.toString());
        }

    }

    @Override
    public void editContract() {

    }
}
