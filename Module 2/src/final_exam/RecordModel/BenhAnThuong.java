package final_exam.RecordModel;

public class BenhAnThuong extends BenhAn {
    private double fee;

    public BenhAnThuong(int number, String id, String idPatient, String name, String startDate, String endDate, String reason, double fee) {
        super(number, id, idPatient, name, startDate, endDate, reason);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                "number=" + super.getNumber() +
                ", id=" + super.getId() +
                ", id Patient=" + super.getIdPatient() +
                ", name='" + super.getName() + '\'' +
                ", startDate='" + super.getStartDate() + '\'' +
                ", endDate='" + super.getEndDate() + '\'' +
                ", reason='" + super.getReason() + '\'' +
                ", fee=" + fee +
                '}';
    }
}
