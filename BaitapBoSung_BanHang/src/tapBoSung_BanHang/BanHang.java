package tapBoSung_BanHang;
import java.util.Scanner;
public class BanHang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        String tenSP = sc.nextLine();

        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();

        System.out.print("Nhập đơn giá: ");
        double donGia = sc.nextDouble();

        double thanhTien = soLuong * donGia;
        double giamGia = 0;

        if (thanhTien >= 5000000) {
            giamGia = thanhTien * 0.10;
        }

        double thanhToan = thanhTien - giamGia;

        System.out.println("\n===== HÓA ĐƠN BÁN HÀNG =====");
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Đơn giá: " + donGia + " đồng");
        System.out.println("Thành tiền: " + thanhTien + " đồng");
        System.out.println("Giảm giá: " + giamGia + " đồng");
        System.out.println("Số tiền phải thanh toán: " + thanhToan + " đồng");

        sc.close();
	}

}
