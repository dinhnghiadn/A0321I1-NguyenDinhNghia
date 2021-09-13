package final_exam.RecordModel;

public class BenhAnVip extends BenhAn {
    private String vipType;
    private String vipDate;

    public BenhAnVip(int number, String id, String idPatient, String name, String startDate, String endDate, String reason, String vipType, String vipDate) {
        super(number, id, idPatient, name, startDate, endDate, reason);
        this.vipType = vipType;
        this.vipDate = vipDate;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public String getVipDate() {
        return vipDate;
    }

    public void setVipDate(String vipDate) {
        this.vipDate = vipDate;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" +
                "number=" + super.getNumber() +
                ", id=" + super.getId() +
                ", id Patient=" + super.getIdPatient() +
                ", name='" + super.getName() + '\'' +
                ", startDate='" + super.getStartDate() + '\'' +
                ", endDate='" + super.getEndDate() + '\'' +
                ", reason='" + super.getReason() + '\'' +
                ", vipType='" + vipType + '\'' +
                ", vipDate='" + vipDate + '\'' +
                '}';
    }
}
