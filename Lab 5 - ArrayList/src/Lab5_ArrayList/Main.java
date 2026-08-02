package Lab5_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        ArrayList<Laptop> ds = new ArrayList<>();

	        System.out.print("Nhập số lượng laptop: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < n; i++) {

	            System.out.println("\nLaptop thứ " + (i + 1));

	            System.out.print("Mã laptop: ");
	            String ma = sc.nextLine();

	            System.out.print("Tên laptop: ");
	            String ten = sc.nextLine();

	            System.out.print("Hãng: ");
	            String hang = sc.nextLine();

	            System.out.print("Giá: ");
	            double gia = sc.nextDouble();
	            sc.nextLine();

	            ds.add(new Laptop(ma, ten, hang, gia));
	        }

	        System.out.println("\n===== DANH SÁCH LAPTOP =====");

	        double tong = 0;

	        for (Laptop lt : ds) {
	            lt.hienThi();
	            tong += lt.getGia();
	        }

	        System.out.println("--------------------------------------------");
	        System.out.println("Số lượng laptop: " + ds.size());
	        System.out.println("Tổng giá trị: " + tong + " VNĐ");
	        System.out.println("Giá trung bình: " + (tong / ds.size()) + " VNĐ");

	        sc.close();
	}

}
