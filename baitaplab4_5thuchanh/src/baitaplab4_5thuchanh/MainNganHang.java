package baitaplab4_5thuchanh;

public class MainNganHang {
	 String soTaiKhoan;
	    String tenChuTaiKhoan;
	    double soDu;
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 TaiKhoanNganHang tk1 = new TaiKhoanNganHang();
	        tk1.soTaiKhoan = "001";
	        tk1.tenChuTaiKhoan = "Nguyễn Văn A";
	        tk1.soDu = 5000000;

	        TaiKhoanNganHang tk2 = new TaiKhoanNganHang();
	        tk2.soTaiKhoan = "002";
	        tk2.tenChuTaiKhoan = "Trần Văn B";
	        tk2.soDu = 2000000;

	        System.out.println("=== TRƯỚC KHI CHUYỂN TIỀN ===");
	        tk1.hienThiSoDu();
	        tk2.hienThiSoDu();

	        tk1.chuyenTien(tk2, 1000000);

	        System.out.println("=== SAU KHI CHUYỂN TIỀN ===");
	        tk1.hienThiSoDu();
	        tk2.hienThiSoDu();
	        
	}
}
		
	


