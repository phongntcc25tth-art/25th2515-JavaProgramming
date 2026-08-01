package bai4_BMI;
import java.util.Scanner;
public class bmi {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhập chiều cao (m): ");
			double chieuCao = sc.nextDouble();

			System.out.print("Nhập cân nặng (kg): ");
			double canNang = sc.nextDouble();

			double bmi = canNang / (chieuCao * chieuCao);

			System.out.printf("Chỉ số BMI: %.2f\n", bmi);

			if (bmi < 18.5) System.out.println("Tình trạng: Gầy");
			else if (bmi < 23) System.out.println("Tình trạng: Bình thường");
			else if (bmi < 25) System.out.println("Tình trạng: Thừa cân");
			else System.out.println("Tình trạng: Béo phì");
		}
	}

}
