package baitaplab5_2thuchanh;

public class SinhVien {
	String maSV;
    String hoTen;
    double diemTB;

    SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    void hienThiThongTin() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm TB: " + diemTB);
        System.out.println("------------------");
}
}