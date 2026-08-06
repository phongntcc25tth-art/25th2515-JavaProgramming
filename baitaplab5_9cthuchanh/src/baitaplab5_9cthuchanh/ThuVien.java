package baitaplab5_9cthuchanh;
import java.util.ArrayList;
public class ThuVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        ArrayList<TaiLieu> dsTaiLieu = new ArrayList<>();
		        ArrayList<ThanhVien> dsThanhVien = new ArrayList<>();

		        TaiLieu tl1 = new TaiLieu("TL01", "Lập trình Java");
		        TaiLieu tl2 = new TaiLieu("TL02", "Cấu trúc dữ liệu");

		        dsTaiLieu.add(tl1);
		        dsTaiLieu.add(tl2);

		        ThanhVien tv1 = new ThanhVien("TV01", "Nguyễn Văn A");
		        dsThanhVien.add(tv1);

		        // Mượn tài liệu
		        tv1.muonTaiLieu(tl1);

		        // Hiển thị
		        System.out.println("=== DANH SÁCH TÀI LIỆU ===");
		        for (TaiLieu tl : dsTaiLieu) {
		            System.out.println(tl.maTL + " - " + tl.tenTL);
		        }

		        System.out.println("\n=== THÔNG TIN THÀNH VIÊN ===");
		        System.out.println(tv1.tenTV + " đã mượn:");

		        for (TaiLieu tl : tv1.dsMuon) {
		            System.out.println("- " + tl.tenTL);
		        }
		    }
		
	}



