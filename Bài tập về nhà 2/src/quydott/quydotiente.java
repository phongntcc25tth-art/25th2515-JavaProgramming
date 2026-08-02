package quydott;
import java.util.Scanner;
public class quydotiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Nhập số USD: ");
	        double usd = sc.nextDouble();

	        System.out.print("Nhập số EUR: ");
	        double eur = sc.nextDouble();

	        double tienUSD = usd * 23500;
	        double tienEUR = eur * 27000;

	        System.out.printf("%.2f USD = %,.0f VND\n", usd, tienUSD);
	        System.out.printf("%.2f EUR = %,.0f VND\n", eur, tienEUR);

	        sc.close();
	}

}
