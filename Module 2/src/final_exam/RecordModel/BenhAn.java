package final_exam.RecordModel;

public abstract class BenhAn {
    private int number;
    private String id;
    private String idPatient;
    private String name;
    private String startDate;
    private String endDate;
    private String reason;

    public BenhAn(int number, String id, String idPatient, String name, String startDate, String endDate, String reason) {
        this.number = number;
        this.id = id;
        this.idPatient = idPatient;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "number=" + number +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
