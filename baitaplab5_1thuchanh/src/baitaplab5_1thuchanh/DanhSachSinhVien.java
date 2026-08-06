package baitaplab5_1thuchanh;
import java.util.ArrayList;
import java.util.List;

public class DanhSachSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> danhSach = new ArrayList<>();

	        // Thêm phần tử
	        danhSach.add("Nguyễn Văn A");
	        danhSach.add("Trần Thị B");
	        danhSach.add("Lê Văn C");

	        // Hiển thị danh sách
	        System.out.println("Danh sách sinh viên:");
	        for (String ten : danhSach) {
	            System.out.println(ten);
	        }

	        // Số lượng phần tử
	        System.out.println("Số sinh viên: " + danhSach.size());

	        // Kiểm tra tồn tại
	        System.out.println("Có Nguyễn Văn A không? "
	                + danhSach.contains("Nguyễn Văn A"));

	        // Xóa phần tử
	        danhSach.remove("Trần Thị B");

	        // Hiển thị sau khi xóa
	        System.out.println("\nDanh sách sau khi xóa:");
	        for (String ten : danhSach) {
	            System.out.println(ten);
	}
	}
}
