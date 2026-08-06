package baitaplab5_4bthuchanh;
import java.util.ArrayList;
public class QuanLySanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> ds = new ArrayList<>();

        // Thêm sản phẩm
        ds.add(new SanPham("SP01", "Bút", 5000, 20));
        ds.add(new SanPham("SP02", "Vở", 10000, 5));
        ds.add(new SanPham("SP03", "Thước", 7000, 8));

        // Hiển thị danh sách
        System.out.println("=== DANH SÁCH SẢN PHẨM ===");
        for (SanPham sp : ds) {
            sp.hienThi();
        }

        // Tính tổng giá trị kho
        double tong = 0;
        for (SanPham sp : ds) {
            tong += sp.gia * sp.soLuong;
        }

        System.out.println("\nTổng giá trị kho: " + tong);

        // Liệt kê sản phẩm sắp hết hàng
        System.out.println("\nSản phẩm sắp hết hàng:");
        for (SanPham sp : ds) {
            if (sp.soLuong < 10) {
                sp.hienThi();
            }
        }
	}

}
