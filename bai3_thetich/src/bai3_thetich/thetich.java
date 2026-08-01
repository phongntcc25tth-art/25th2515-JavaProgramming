package bai3_thetich;
import java.util.Scanner;
public class thetich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Nhập cạnh khối lập phương: ");
	        double a = sc.nextDouble();

	        double theTich = a * a * a;

	        System.out.println("Thể tích khối lập phương = " + theTich);

	        sc.close();
	}

}
