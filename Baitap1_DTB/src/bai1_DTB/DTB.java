package bai1_DTB;
import java.util.Scanner;
public class DTB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ và tên: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        double dtb = sc.nextDouble();

        System.out.println("\n===== THÔNG TIN SINH VIÊN =====");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + dtb);

        sc.close();
	}

}
