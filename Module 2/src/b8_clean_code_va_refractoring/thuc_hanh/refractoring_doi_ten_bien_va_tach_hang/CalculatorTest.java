package b8_clean_code_va_refractoring.thuc_hanh.refractoring_doi_ten_bien_va_tach_hang;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println(Calculator.calculate(5,6,'+'));  //11
        System.out.println(Calculator.calculate(3,2,'-'));  //1
        System.out.println(Calculator.calculate(3,2,'*'));  //6
        System.out.println(Calculator.calculate(6,2,'/'));  //3
        System.out.println(Calculator.calculate(3,0,'/')); //RuntimeException can not divide by 0
    }
}
