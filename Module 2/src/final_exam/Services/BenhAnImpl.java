package final_exam.Services;

import case_study.utils.RegexData;
import final_exam.RecordModel.BenhAn;
import final_exam.RecordModel.BenhAnThuong;
import final_exam.RecordModel.BenhAnVip;
import final_exam.utils.NotFoundMedicalRecordException;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnImpl implements Service  {

    public static final String REGEX_MABENHAN = "(BA)[-][\\d]{3}";
    public static final String REGEX_MABENHNHAN = "(BN)[-][\\d]{3}";
    public static final String REGEX_DATE = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
    public static final String REGEX_VIP = "(VIP1)|(VIP2)|(VIP3)";

    private static List<BenhAn> benhAnList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    int number = benhAnList.size()+1;

    @Override
    public void display() {
        for (BenhAn benhAn : benhAnList){
            System.out.println(benhAn.toString());
        }

    }
    @Override
    public void addNewVip() {

        String id = inputIdBenhAn();
        String idPatient = inputIdBenhNhan();
        System.out.println("Nhập tên bệnh nhân:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày nhập viện:");
        String startDate = RegexData.regexStr(scanner.nextLine(),REGEX_DATE,"Bạn đã nhập sai định dạng, định dạng ngày tháng là dd/MM/yyyy");
        System.out.println("Nhập ngày xuất viện viện:");
        String endDate = RegexData.regexStr(scanner.nextLine(),REGEX_DATE,"Bạn đã nhập sai định dạng, định dạng ngày tháng là dd/MM/yyyy");
        System.out.println("Nhập lý do nhập viện:");
        String reason = scanner.nextLine();
        System.out.println("Nhập loại VIP:");
        String vipType = RegexData.regexStr(scanner.nextLine(),REGEX_VIP,"Bạn đã nhập sai định dạng, có 3 loại VIP1, VIP2, VIP3");
        System.out.println("Nhập thời hạn VIP:");
        String vipDate = RegexData.regexStr(scanner.nextLine(),REGEX_DATE,"Bạn đã nhập sai định dạng, định dạng ngày tháng là dd/MM/yyyy");
        BenhAnVip benhAnVip = new BenhAnVip(number,id,idPatient,name,startDate,endDate,reason,vipType,vipDate);
        benhAnList.add(benhAnVip);
        try {
            FileWriter fileWriter = new FileWriter("F:\\2.CODEGYM\\A0321I1_NguyenDinhNghia\\Module 2\\medical_record.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(benhAnVip.toString());
            fileWriter.close();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Đã thêm mới bệnh án thành công !");
        number++;

    }

    @Override
    public void addNewNormal() {

        String id = inputIdBenhAn();
        String idPatient = inputIdBenhNhan();
        System.out.println("Nhập tên bệnh nhân:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày nhập viện:");
        String startDate = RegexData.regexStr(scanner.nextLine(),REGEX_DATE,"Bạn đã nhập sai định dạng, định dạng ngày tháng là dd/MM/yyyy");
        System.out.println("Nhập ngày xuất viện viện:");
        String endDate = RegexData.regexStr(scanner.nextLine(),REGEX_DATE,"Bạn đã nhập sai định dạng, định dạng ngày tháng là dd/MM/yyyy");
        System.out.println("Nhập lý do nhập viện:");
        String reason = scanner.nextLine();
        System.out.println("Nhập phí nằm viện:");
        double fee = Double.parseDouble(scanner.nextLine());
        BenhAnThuong benhAnThuong = new BenhAnThuong(number,id,idPatient,name,startDate,endDate,reason,fee);
        benhAnList.add(benhAnThuong);
        try {
            FileWriter fileWriter = new FileWriter("F:\\2.CODEGYM\\A0321I1_NguyenDinhNghia\\Module 2\\medical_record.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(benhAnThuong.toString());
            fileWriter.close();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Đã thêm mới bệnh án thành công !");
        number++;

    }

    @Override
    public void delete() {
        System.out.println("Nhập vào mã bệnh án:");
        String id = scanner.nextLine();
        try {
            boolean check = false;
            for (BenhAn benhAn : benhAnList){
                if (benhAn.getId() == id){
                    check = true;
                    benhAnList.remove(benhAn);
                    System.out.println("Xoá bệnh án thành công!");
                }
            }
            if (!check) {
                throw new NotFoundMedicalRecordException("Bệnh án không tồn tại.");
            }
        } catch (NotFoundMedicalRecordException e) {
            e.getMessage();
        }

    }


    private String inputIdBenhAn(){
        System.out.println("Nhập mã bệnh án:");
        return RegexData.regexStr(scanner.nextLine(),REGEX_MABENHAN,"Bạn đã nhập sai định dạng, mã bệnh án phải có dạng BA-XXX");
    }
    private String inputIdBenhNhan(){
        System.out.println("Nhập mã bệnh nhân:");
        return RegexData.regexStr(scanner.nextLine(),REGEX_MABENHNHAN,"Bạn đã nhập sai định dạng, mã bệnh nhân phải có dạng BN-XXX");
    }
}
