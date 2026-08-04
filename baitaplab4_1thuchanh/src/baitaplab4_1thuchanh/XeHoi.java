package baitaplab4_1thuchanh;

public class XeHoi {
	// Thuộc tính
    String hangXe;
    String mauSac;
    int tocDoHienTai;

    // Phương thức tăng tốc
    void tangToc(int km) {
        tocDoHienTai += km;
        System.out.println(hangXe + " tăng tốc lên " + tocDoHienTai + " km/h");
    }

    // Phương thức phanh
    void phanh() {
        tocDoHienTai = 0;
        System.out.println(hangXe + " đã dừng lại");
    }

    // Phương thức hiển thị thông tin
    void hienThiThongTin() {
        System.out.println("Hãng xe: " + hangXe);
        System.out.println("Màu sắc: " + mauSac);
        System.out.println("Tốc độ hiện tại: " + tocDoHienTai + " km/h");
}
}