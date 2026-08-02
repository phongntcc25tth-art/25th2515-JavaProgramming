package Bài3_gptb1;
import java.util.Scanner;
public class giaiphuongtrinhbac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // 1. Khai báo các biến
        double a;
        double b;
        double x;

        // 2. Nhập dữ liệu
        System.out.print("Nhập a: ");
        a = sc.nextDouble();

        System.out.print("Nhập b: ");
        b = sc.nextDouble();

        // 3. Tính toán
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            x = -b / a;

            // 4. In kết quả
            System.out.println("Nghiệm x = " + x);
        }

        sc.close();
	}

}
