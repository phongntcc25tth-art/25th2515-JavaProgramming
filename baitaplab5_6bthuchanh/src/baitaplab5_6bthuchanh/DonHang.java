package baitaplab5_6bthuchanh;
import java.util.ArrayList;
public class DonHang {
	String maDH;
    String tenKH;
    ArrayList<String> danhSachSanPham;
    double tongTien;

    public DonHang(String maDH, String tenKH, double tongTien) {
        this.maDH = maDH;
        this.tenKH = tenKH;
        this.tongTien = tongTien;
        this.danhSachSanPham = new ArrayList<>();
    }

    void themSanPham(String sp) {
        danhSachSanPham.add(sp);
    }

    void hienThi() {
        System.out.println("Mã ĐH: " + maDH);
        System.out.println("Khách hàng: " + tenKH);
        System.out.println("Sản phẩm: " + danhSachSanPham);
        System.out.println("Tổng tiền: " + tongTien);
        System.out.println("----------------------");
    }
}
