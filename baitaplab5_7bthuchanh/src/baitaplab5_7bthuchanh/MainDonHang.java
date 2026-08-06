package baitaplab5_7bthuchanh;
import java.util.ArrayList;
public class MainDonHang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<DonHang> ds = new ArrayList<>();

	        ds.add(new DonHang("DH01", "An", 500000));
	        ds.add(new DonHang("DH02", "Bình", 800000));
	        ds.add(new DonHang("DH03", "An", 300000));

	        // Hiển thị danh sách
	        for (DonHang dh : ds) {
	            System.out.println(dh.maDH + " - " + dh.tenKH +
	                               " - " + dh.tongTien);
	        }

	        // Tìm đơn hàng lớn nhất
	        DonHang max = ds.get(0);
	        for (DonHang dh : ds) {
	            if (dh.tongTien > max.tongTien) {
	                max = dh;
	            }
	        }

	        System.out.println("\nĐơn hàng lớn nhất:");
	        System.out.println(max.maDH + " - " + max.tongTien);

	        // Tính tổng doanh thu
	        double tong = 0;
	        for (DonHang dh : ds) {
	            tong += dh.tongTien;
	        }

	        System.out.println("Tổng doanh thu: " + tong);
	    }

}
