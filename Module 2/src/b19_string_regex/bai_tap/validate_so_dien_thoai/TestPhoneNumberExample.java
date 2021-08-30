package b19_string_regex.bai_tap.validate_so_dien_thoai;


public class TestPhoneNumberExample {
    public static final String[] validPhoneNumber = new String[]{"72-0291286382", "84-0758291482"};
    public static final String[] invalidPhoneNumber = new String[]{"a1-0281382192", "82-87582914"};

    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        for (String name : validPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(name);
            System.out.println("Phone number is " + name + " is valid: " + isvalid);
        }
        for (String name : invalidPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(name);
            System.out.println("Phone number is " + name + " is invalid: " + isvalid);
        }
    }
}
