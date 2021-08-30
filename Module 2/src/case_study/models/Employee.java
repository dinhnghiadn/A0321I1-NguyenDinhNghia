package case_study.models;

public class Employee extends Person {
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, String sex, String idCard, String phone, String email, String level, String position, int salary) {
        super(id, name, age, sex, phone, idCard, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }


    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", sex='" + super.getSex() + '\'' +
                ", idCard='" + super.getIdCard() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
