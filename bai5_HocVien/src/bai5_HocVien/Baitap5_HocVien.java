package bai5_HocVien;
import java.util.Scanner;
public class Baitap5_HocVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã học viên: ");
        String ma = sc.nextLine();

        System.out.print("Nhập họ tên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập năm sinh: ");
        int nam = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập giới tính: ");
        String gt = sc.nextLine();

        HocVien hv = new HocVien(ma, ten, nam, gt);

        System.out.println("\n===== THÔNG TIN HỌC VIÊN =====");
        hv.hienThi();

        sc.close();
    }

	}


