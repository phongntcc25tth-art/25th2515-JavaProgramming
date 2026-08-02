package bai1_ttl;
import java.util.Scanner;
public class ttl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số giờ làm: ");
        double gioLam = sc.nextDouble();

        System.out.print("Nhập lương theo giờ: ");
        double luongGio = sc.nextDouble();

        double tongLuong;

        if (gioLam <= 40) {
            tongLuong = gioLam * luongGio;
        } else {
            tongLuong = 40 * luongGio + (gioLam - 40) * luongGio * 1.5;
        }

        System.out.printf("Tổng lương: %,.0f VND\n", tongLuong);

        sc.close();
	}

}
