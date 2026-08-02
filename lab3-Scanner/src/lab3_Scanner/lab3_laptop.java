package lab3_Scanner;
import java.util.Scanner;
public class lab3_laptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập tên laptop: ");
        String tenLaptop = sc.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String hang = sc.nextLine();

        System.out.print("Nhập giá bán (VNĐ): ");
        double giaBan = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();

        // Tính toán
        double thanhTien = giaBan * soLuong;
        double vat = thanhTien * 0.08;
        double tongTien = thanhTien + vat;

        // Xuất kết quả
        System.out.println("\n===== HÓA ĐƠN MUA LAPTOP =====");
        System.out.println("Tên laptop : " + tenLaptop);
        System.out.println("Hãng       : " + hang);
        System.out.println("Giá bán    : " + giaBan + " VNĐ");
        System.out.println("Số lượng   : " + soLuong);
        System.out.println("Thành tiền : " + thanhTien + " VNĐ");
        System.out.println("VAT (8%)   : " + vat + " VNĐ");
        System.out.println("Tổng tiền  : " + tongTien + " VNĐ");

        sc.close();
	}

}
