package baitaplab3_2btvenha;
import java.util.Scanner;
public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        final double RATE = 26000; // 1 USD = 26.000 VND

        System.out.println("1. USD -> VND");
        System.out.println("2. VND -> USD");
        System.out.print("Chọn: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Nhập số USD: ");
            double usd = scanner.nextDouble();

            double vnd = usd * RATE;

            System.out.printf("%.2f USD = %,.0f VND%n", usd, vnd);

        } else if (choice == 2) {
            System.out.print("Nhập số VND: ");
            double vnd = scanner.nextDouble();

            double usd = vnd / RATE;

            System.out.printf("%,.0f VND = %.2f USD%n", vnd, usd);

        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }

        scanner.close();
	}

}
