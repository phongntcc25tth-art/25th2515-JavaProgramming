package Lab2_loptop;

public class Lab2_loptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khai báo biến
        String tenLaptop = "VICTUS";
        String hang = "Dell";
        double giaBan = 1970000;
        int soLuong = 2;

        // Tính toán
        double thanhTien = giaBan * soLuong;
        double giamGia = thanhTien * 0.05;
        double tongTien = thanhTien - giamGia;

        // Hiển thị kết quả
        System.out.println("===== THÔNG TIN LAPTOP =====");
        System.out.println("Tên laptop: " + tenLaptop);
        System.out.println("Hãng: " + hang);
        System.out.println("Giá bán: " + giaBan + " VNĐ");
        System.out.println("Số lượng: " + soLuong);

        System.out.println("----------------------------");
        System.out.println("Thành tiền: " + thanhTien + " VNĐ");
        System.out.println("Giảm giá (5%): " + giamGia + " VNĐ");
        System.out.println("Tổng thanh toán: " + tongTien + " VNĐ");
	}

}
