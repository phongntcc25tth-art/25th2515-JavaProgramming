package baitaplab5_2thuchanh;
import java.util.ArrayList;
public class MainSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SinhVien> danhSach = new ArrayList<>();

        danhSach.add(new SinhVien("SV001", "Nguyễn Văn A", 8.5));
        danhSach.add(new SinhVien("SV002", "Trần Thị B", 7.2));
        danhSach.add(new SinhVien("SV003", "Lê Văn C", 9.0));

        System.out.println("=== DANH SÁCH SINH VIÊN ===");

        for (SinhVien sv : danhSach) {
            sv.hienThiThongTin();
	}

}
}