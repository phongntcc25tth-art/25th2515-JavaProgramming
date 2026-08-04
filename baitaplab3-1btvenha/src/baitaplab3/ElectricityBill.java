package baitaplab3;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số điện tiêu thụ (kWh): ");
	        int kWh = scanner.nextInt();

	        double bill = 0;

	        if (kWh <= 50) {
	            bill = kWh * 1806;
	        } else if (kWh <= 100) {
	            bill = 50 * 1806 + (kWh - 50) * 1866;
	        } else if (kWh <= 200) {
	            bill = 50 * 1806 + 50 * 1866 + (kWh - 100) * 2167;
	        } else if (kWh <= 300) {
	            bill = 50 * 1806 + 50 * 1866 + 100 * 2167
	                    + (kWh - 200) * 2729;
	        } else if (kWh <= 400) {
	            bill = 50 * 1806 + 50 * 1866 + 100 * 2167
	                    + 100 * 2729 + (kWh - 300) * 3050;
	        } else {
	            bill = 50 * 1806 + 50 * 1866 + 100 * 2167
	                    + 100 * 2729 + 100 * 3050
	                    + (kWh - 400) * 3151;
	        }

	        System.out.printf("Tiền điện phải trả: %,.0f VNĐ%n", bill);

	        scanner.close();
	}

}
