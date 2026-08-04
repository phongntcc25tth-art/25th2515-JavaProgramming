package baitaplab3_3btvenha;
import java.io.*;
import java.util.Scanner;
public class PersonalDiary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("===== NHẬT KÝ CÁ NHÂN =====");
	        System.out.println("1. Ghi nhật ký");
	        System.out.println("2. Đọc nhật ký");
	        System.out.print("Chọn chức năng: ");

	        int choice = scanner.nextInt();
	        scanner.nextLine();

	        String fileName = "diary.txt";

	        try {
	            if (choice == 1) {
	                System.out.print("Nhập nội dung nhật ký: ");
	                String content = scanner.nextLine();

	                FileWriter writer = new FileWriter(fileName, true);
	                writer.write(content + "\n");
	                writer.close();

	                System.out.println("Đã lưu nhật ký!");

	            } else if (choice == 2) {
	                File file = new File(fileName);

	                if (!file.exists()) {
	                    System.out.println("Chưa có nhật ký nào.");
	                } else {
	                    BufferedReader reader =
	                            new BufferedReader(new FileReader(file));

	                    String line;

	                    System.out.println("\n===== NỘI DUNG NHẬT KÝ =====");

	                    while ((line = reader.readLine()) != null) {
	                        System.out.println(line);
	                    }

	                    reader.close();
	                }
	            } else {
	                System.out.println("Lựa chọn không hợp lệ!");
	            }

	        } catch (IOException e) {
	            System.out.println("Lỗi: " + e.getMessage());
	        }

	        scanner.close();
	}

}
