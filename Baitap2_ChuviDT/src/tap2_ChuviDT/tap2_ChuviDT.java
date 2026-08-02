package tap2_ChuviDT;
import java.util.Scanner;
public class tap2_ChuviDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên sinh viên: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhập điểm: ");
        double diem = sc.nextDouble();

        System.out.println("\n===== KẾT QUẢ =====");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm: " + diem);

        if (diem < 5) {
            System.out.println("Xếp loại: Yếu");
        } else if (diem < 6.5) {
            System.out.println("Xếp loại: Trung bình");
        } else if (diem < 8) {
            System.out.println("Xếp loại: Khá");
        } else if (diem < 9) {
            System.out.println("Xếp loại: Giỏi");
        } else {
            System.out.println("Xếp loại: Xuất sắc");
        }

        sc.close();
	}

}
