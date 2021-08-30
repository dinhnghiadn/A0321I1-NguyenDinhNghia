package case_study.models;

public class Customer extends Person {
    private String typeCustomer;
    private String address;

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer() {
    }

    public Customer(int id, String name, int age, String sex, String idCard, String phone, String email, String typeCustomer, String address) {
        super(id, name, age, sex, idCard, phone, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", sex='" + super.getSex() + '\'' +
                ", idCard='" + super.getIdCard() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
