package baitaplab5_4bthuchanh;

public class SanPham {
	String maSP;
    String tenSP;
    double gia;
    int soLuong;

    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    void hienThi() {
        System.out.println(maSP + " - " + tenSP +
                " - Giá: " + gia +
                " - SL: " + soLuong);
}
}