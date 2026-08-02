package Lab2_bdlvcpt;
import java.util.Scanner;
public class Lab2_bien {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Nhập thông tin sản phẩm
        System.out.print("Nhập tên sản phẩm: ");
        String tenSP = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        double donGia = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        
        int soLuong = sc.nextInt();

        // Tính toán
        double thanhTien = donGia * soLuong;
        double vat = thanhTien * 0.08;
        double tongTien = thanhTien + vat;

        // Xuất kết quả
        System.out.println("\n===== HÓA ĐƠN =====");
        System.out.println("Tên sản phẩm : " + tenSP);
        System.out.println("Đơn giá      : " + donGia);
        System.out.println("Số lượng     : " + soLuong);
        System.out.println("Thành tiền   : " + thanhTien);
        System.out.println("VAT (8%)     : " + vat);
        System.out.println("Tổng tiền    : " + tongTien);

     
        sc.close();
	
	}
}

