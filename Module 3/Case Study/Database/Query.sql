use case_study_database;
-- Yêu cầu 2: Hiển thị thông tin của tất cả nhân viên có trong hệ thống 
-- có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự
select * from NhanVien where (HoTen like 'T%' or HoTen like 'H%' or HoTen like 'K%') and length(HoTen) <= 15;

-- Yêu cầu 3: Hiển thị thông tin của tất cả khách hàng 
-- có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from KhachHang where (DiaChi = 'Đà Nẵng' or DiaChi = 'Quảng Trị') and (TIMESTAMPDIFF(YEAR, NgaySinh, CURDATE()) >= 18 and TIMESTAMPDIFF(YEAR, NgaySinh, CURDATE()) <=50) ;

-- Yêu cầu 4:	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select HoTen, count(KhachHang.IDKhachHang) as 'Số lần đặt phòng Diamond' from KhachHang left join HopDong 
on KhachHang.IDKhachHang = HopDong.IDKhachHang where IDLoaiKhach = '1' group by KhachHang.HoTen order by count(KhachHang.IDKhachHang) desc ;

-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, 
-- với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phòng.
-- (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select KhachHang.IDKhachHang, HoTen, TenLoaiKhach, HopDong.IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, sum(HopDong.TongTien + DichVuDiKem.Gia*HopDongChiTiet.SoLuong) as 'Tổng Chi Phí' 
from (KhachHang inner join LoaiKhach on KhachHang.IDLoaiKhach = LoaiKhach.IDLoaiKhach) left join 
( (HopDong inner join (HopDongChiTiet inner join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem ) on HopDong.IDHopDong = HopDongChiTiet.IDHopDong)
 inner join DichVu on HopDong.IDDichVu = DichVu.IDDichVu)
on KhachHang.IDKhachHang = HopDong.IDKhachHang group by HoTen;

-- Yêu cầu 6:	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu
--  của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu from 
(select DichVu.IDDichVu, TenDichVu, DienTich, ChiPhiThue, LoaiDichVu.TenLoaiDichVu, max(NgayLamHopDong) from
(DichVu left join HopDong on DichVu.IDDichVu = HopDong.IDDichVu)
 inner join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVu.IDLoaiDichVu 
 group by TenDichVu having(max(NgayLamHopDong) is null or max(NgayLamHopDong) < '2019-01-01')) as subquery; 
 
 -- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
 -- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018
-- nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select DichVu.IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, LoaiDichVu.TenLoaiDichVu from
(DichVu inner join HopDong on DichVu.IDDichVu = HopDong.IDDichVu)
 inner join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVu.IDLoaiDichVu
  where ( year(NgayLamHopDong) = 2018 and HopDong.IDDichVu not in (select IDDichVu from HopDong where year(NgayLamHopDong) = 2019)); 

-- Yêu cầu 8	Hiển thị thông tin HoTenKhachHang có trong hệ thống,
-- với yêu cầu HoThenKhachHang không trùng nhau. (3 cách)
select HoTen from khachhang group by HoTen;
select distinct HoTen from khachhang;
select HoTen from
(select HoTen, row_number() over(partition by HoTen) as row_num from khachhang order by IDKhachHang) as subquery
where row_num = 1;

-- Yêu cầu 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019
--  thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(NgayLamHopDong) as 'Tháng trong năm 2019', sum(HopDong.TongTien + DichVuDiKem.Gia*HopDongChiTiet.SoLuong) as 'Doanh Thu'
from HopDong inner join (HopDongChiTiet inner join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem ) 
on HopDong.IDHopDong = HopDongChiTiet.IDHopDong where year(NgayLamHopDong) = 2019 group by month(NgayLamHopDong);

-- Yêu cầu 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (được tính dựa trên việc count các IDHopDongChiTiet).
select HopDong.IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, count(IDHopDongChiTiet) as 'SoLuongDichVuDiKem' 
from HopDong inner join HopDongChiTiet 
on HopDong.IDHopDong = HopDongChiTiet.IDHopDong group by IDHopDong;

-- Yêu cầu 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng 
-- bởi những Khách hàng có TenLoaiKhachHang là “Diamond” 
-- và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select KhachHang.IDKhachHang, HoTen, TenDichVuDiKem, SoLuong, Gia
from (KhachHang inner join LoaiKhach on KhachHang.IDLoaiKhach = LoaiKhach.IDLoaiKhach) inner join 
( (HopDong inner join (HopDongChiTiet inner join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem ) on HopDong.IDHopDong = HopDongChiTiet.IDHopDong)
 inner join DichVu on HopDong.IDDichVu = DichVu.IDDichVu)
on KhachHang.IDKhachHang = HopDong.IDKhachHang where (DiaChi in ('Vinh','Quảng Ngãi') and TenLoaiKhach = 'Diamond') order by IDKhachHang;

-- Yêu cầu 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc
-- của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select HopDong.IDHopDong, NhanVien.HoTen as 'TenNhanVien', KhachHang.HoTen as 'TenKhachHang', KhachHang.SDT, TenDichVu,count(IDHopDongChiTiet) as 'SoLuongDichVuDiKem'
from  (NhanVien inner join (KhachHang  inner join 
( (HopDong inner join (HopDongChiTiet inner join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem ) on HopDong.IDHopDong = HopDongChiTiet.IDHopDong)
 inner join DichVu on HopDong.IDDichVu = DichVu.IDDichVu)
on KhachHang.IDKhachHang = HopDong.IDKhachHang)
on NhanVien.IDNhanVien = HopDong.IDNhanVien) 
where  ((month(NgayLamHopDong) in (10,11,12) and year(NgayLamHopDong) = 2019) and HopDong.IDDichVu not in (select IDDichVu from HopDong where (month(NgayLamHopDong) in (1,2,3,4,5,6) and year(NgayLamHopDong) = 2019))) group by IDHopDong; 

-- Yêu cầu 13: Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select * from (select HopDongChiTiet.IDDichVuDiKem, TenDichVuDiKem, count(IDHopDongChiTiet) as SoLanSuDung 
from HopDongChiTiet inner join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem group by DichVuDiKem.IDDichVuDiKem) as s2 where s2.SoLanSuDung =
(select max(s1.count) as max1 from (select HopDongChiTiet.IDDichVuDiKem, TenDichVuDiKem, count(IDHopDongChiTiet) as count 
from HopDongChiTiet inner join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem group by DichVuDiKem.IDDichVuDiKem) as s1);

-- Yêu cầu 14: Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
select HopDongChiTiet.IDHopDong, TenDichVuDiKem, count(IDHopDongChiTiet) as 'Số lần sử dụng' 
from HopDongChiTiet inner join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem group by DichVuDiKem.IDDichVuDiKem having count(IDHopDongChiTiet) = 1;

-- Yêu cầu 15:	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TenTrinhDo, TenBoPhan, SDT, DiaChi
--  mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
select NhanVien.IDNhanVien, HoTen, TenTrinhDo, TenBoPhan, SDT, DiaChi, count(IDHopDong) as 'Số lượng hợp đồng'
from ((NhanVien inner join TrinhDo on NhanVien.IDTrinhDo = TrinhDo.IDTrinhDo) inner join BoPhan on NhanVien.IDBoPhan = BoPhan.IDBoPhan) inner join HopDong on NhanVien.IDNhanVien = HopDong.IDNhanVien group by IDNhanVien having count(IDHopDong) >=3 ;

-- Yêu cầu 16: Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
delete from NhanVien where (IDNhanVien in (select * from (select NhanVien.IDNhanVien from (NhanVien left join HopDong on NhanVien.IDNhanVien = HopDong.IDNhanVien) where 
((year(NgayLamHopDong) not in (2017,2018,2019) or NgayLamHopDong is null)and NhanVien.IDNhanVien 
not in (select HopDong.IDNhanVien from HopDong where year(NgayLamHopDong) in (2017,2018,2019)))) as subquery));


