package baitaplab5_6bthuchanh;
import java.util.ArrayList;
public class QuanLyDonHang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<DonHang> ds = new ArrayList<>();

	        DonHang dh1 = new DonHang("DH01", "Nguyễn Văn A", 500000);
	        dh1.themSanPham("Bút");
	        dh1.themSanPham("Vở");

	        DonHang dh2 = new DonHang("DH02", "Trần Thị B", 800000);
	        dh2.themSanPham("Sách");

	        DonHang dh3 = new DonHang("DH03", "Nguyễn Văn A", 300000);
	        dh3.themSanPham("Thước");

	        ds.add(dh1);
	        ds.add(dh2);
	        ds.add(dh3);

	        // Hiển thị danh sách
	        System.out.println("=== DANH SÁCH ĐƠN HÀNG ===");
	        for (DonHang dh : ds) {
	            dh.hienThi();
	        }

	        // Tìm đơn hàng lớn nhất
	        DonHang max = ds.get(0);
	        for (DonHang dh : ds) {
	            if (dh.tongTien > max.tongTien) {
	                max = dh;
	            }
	        }

	        System.out.println("Đơn hàng giá trị cao nhất:");
	        max.hienThi();

	        // Tính tổng doanh thu
	        double doanhThu = 0;
	        for (DonHang dh : ds) {
	            doanhThu += dh.tongTien;
	        }

	        System.out.println("Tổng doanh thu: " + doanhThu);

	        // Thống kê số đơn theo khách hàng
	        int demA = 0;
	        for (DonHang dh : ds) {
	            if (dh.tenKH.equals("Nguyễn Văn A")) {
	                demA++;
	            }
	        }

	        System.out.println("Nguyễn Văn A có " + demA + " đơn hàng.");
	    }
	}


