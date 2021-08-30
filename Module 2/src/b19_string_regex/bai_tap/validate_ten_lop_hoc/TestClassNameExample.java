package b19_string_regex.bai_tap.validate_ten_lop_hoc;

public class TestClassNameExample {
    public static final String[] validClassName = new String[] {"C5816H","P3511L","A1028G"};
    public static final String[] invalidClassName = new String[] {"B0291H","P201KJ","C8813X"};
    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        for ( String name : validClassName) {
            boolean isvalid = classNameExample.validate(name);
            System.out.println("Class name is " + name +" is valid: "+ isvalid);
        }
        for ( String name : invalidClassName) {
            boolean isvalid = classNameExample.validate(name);
            System.out.println("Class name is " + name +" is invalid: "+ isvalid);
        }

    }
}
