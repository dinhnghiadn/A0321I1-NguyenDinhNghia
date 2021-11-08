package model.bean;

public class BenhAn {
    private int id;
    private int idBenhNhan;
    private String tenBenhNhan;
    private String nhapVien;
    private String xuatVien;
    private String lyDo;

    public BenhAn(int id, int idBenhNhan, String tenBenhNhan, String nhapVien, String xuatVien, String lyDo) {
        this.id = id;
        this.idBenhNhan = idBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.nhapVien = nhapVien;
        this.xuatVien = xuatVien;
        this.lyDo = lyDo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBenhNhan() {
        return idBenhNhan;
    }

    public void setIdBenhNhan(int idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNhapVien() {
        return nhapVien;
    }

    public void setNhapVien(String nhapVien) {
        this.nhapVien = nhapVien;
    }

    public String getXuatVien() {
        return xuatVien;
    }

    public void setXuatVien(String xuatVien) {
        this.xuatVien = xuatVien;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }
}
