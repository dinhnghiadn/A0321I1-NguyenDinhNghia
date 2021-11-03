create database case_study_database;
use case_study_database;
create table LoaiKhach(
	IDLoaiKhach int primary key,
	TenLoaiKhach varchar(45) not null
);
create table KieuThue(
	IDKieuThue int primary key,
	TenKieuThue varchar(45) not null,
    Gia int not null
);
create table LoaiDichVu(
	IDLoaiDichVu int primary key,
	TenLoaiDichVu varchar(45) not null
);
create table ViTri(
	IDViTri int primary key,
	TenViTri varchar(45) not null
);
create table TrinhDo(
	IDTrinhDo int primary key,
	TenTrinhDo varchar(45) not null
);
create table BoPhan(
	IDBoPhan int primary key,
	TenBoPhan varchar(45) not null
);
create table DichVuDiKem(
	IDDichVuDiKem int primary key,
	TenDichVuDiKem varchar(45) not null,
    Gia int not null,
    DonVi int not null,
    TrangThaiKhachDung varchar(45) not null
);
create table NhanVien(
	IDNhanVien int primary key,
	HoTen varchar(50) not null,
	NgaySinh date not null,
	SoCMND varchar(45) not null,
    Luong varchar(45) not null,
    SDT varchar(45) not null,
    Email varchar(45) not null,
    DiaChi varchar(50) not null,
    IDViTri int,
    IDTrinhDo int,
    IDBoPhan int,
    foreign key (IDViTri) references ViTri(IDViTri),
    foreign key (IDTrinhDo) references TrinhDo(IDTrinhDo),
    foreign key (IDBoPhan) references BoPhan(IDBoPhan)
);
create table KhachHang(
	IDKhachHang int primary key,
	HoTen varchar(50) not null,
	NgaySinh date not null,
	SoCMND varchar(45) not null,
    SDT varchar(45) not null,
    Email varchar(45) not null,
    DiaChi varchar(50) not null,
    IDLoaiKhach int,
    foreign key (IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
);
create table DichVu(
	IDDichVu int primary key,
	TenDichVu varchar(50) not null,
	DienTich int not null,
	SoTang int not null,
    SoNguoiToiDa varchar(45) not null,
    ChiPhiThue varchar(45) not null,
    TrangThai varchar(45) not null,
    IDKieuThue int,
    IDLoaiDichVu int,
    foreign key (IDKieuThue) references KieuThue(IDKieuThue),
	foreign key (IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu)
);
create table HopDong(
	IDHopDong int primary key,
	NgayLamHopDong date not null,
	NgayKetThuc date not null,
	TienDatCoc int,
    TongTien int not null,
    IDNhanVien int,
    IDKhachHang int,
    IDDichVu int,
    foreign key (IDNhanVien) references NhanVien(IDNhanVien),
    foreign key (IDKhachHang) references KhachHang(IDKhachHang),
	foreign key (IDDichVu) references DichVu(IDDichVu)
);
create table HopDongChiTiet(
	IDHopDongChiTiet int primary key,
	SoLuong int,
    IDHopDong int,
    IDDichVuDiKem int,
    foreign key (IDHopDong) references HopDong(IDHopDong),
	foreign key (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);
