package baitaplab4_3thuchanh;

public class MainSach {
	 public static void main(String[] args) {

	        Sach s1 = new Sach();
	        s1.tieuDe = "Lập trình Java";
	        s1.tacGia = "Nguyễn Văn A";
	        s1.gia = 120000;
	        s1.soTrang = 300;

	        Sach s2 = new Sach();
	        s2.tieuDe = "Cấu trúc dữ liệu";
	        s2.tacGia = "Trần Văn B";
	        s2.gia = 150000;
	        s2.soTrang = 400;

	        	Sach s3 = new Sach();
	        s3.tieuDe = "OOP Java";
	        s3.tacGia = "Lê Văn C";
	        s3.gia = 180000;
	        s3.soTrang = 500;

	        s1.hienThiThongTin();
	        s2.hienThiThongTin();
	        s3.hienThiThongTin();
}
}