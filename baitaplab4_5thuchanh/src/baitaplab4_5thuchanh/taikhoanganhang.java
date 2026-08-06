package baitaplab4_5thuchanh;
public class taikhoanganhang {
	public class TaiKhoanNganHang {

	    String soTaiKhoan;
	    String tenChuTaiKhoan;
	    double soDu;
	    // Gửi tiền
	    void guiTien(double soTien) {
	        soDu += soTien;
	        System.out.println("Đã gửi " + soTien + " VNĐ");
	    }
	    
	    // Rút tiền
	    boolean rutTien(double soTien) {
	        if (soTien <= soDu) {
	            soDu -= soTien;
	            return true;
	        }else {
	            System.out.println("Không đủ số dư!");
	        return false;
	        }
	    }
	    // Chuyển tiền
	    void chuyenTien(TaiKhoanNganHang taiKhoanKhac, double soTien) {
	        if (rutTien(soTien)) {
	            taiKhoanKhac.guiTien(soTien);
	            System.out.println("Chuyển tiền thành công.");
	        }
	    }
	    // Hiển thị số dư
	    void hienThiSoDu() {
	    	 System.out.println("Số tài khoản: " + soTaiKhoan);
	         System.out.println("Chủ tài khoản: " + tenChuTaiKhoan);
	        System.out.println("Số dư: " + soDu + " VNĐ");
	        System.out.println("----------------------");
	        
	        
	    }
	    }
	}

