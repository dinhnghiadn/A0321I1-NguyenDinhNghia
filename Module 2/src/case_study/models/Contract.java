package case_study.models;

public class Contract {
    private int id;
    private int idBooking;
    private String pre;
    private String pay;
    private int idCustomer;

    public Contract(int id, int idBooking, String pre, String pay, int idCustomer) {
        this.id = id;
        this.idBooking = idBooking;
        this.pre = pre;
        this.pay = pay;
        this.idCustomer = idCustomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", idBooking=" + idBooking +
                ", pre='" + pre + '\'' +
                ", pay='" + pay + '\'' +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
