package baitaplab4_2thuchanh;

public class Main_hcn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.chieuDai = 8;
        hcn1.chieuRong = 5;

        HinhChuNhat hcn2 = new HinhChuNhat();
        hcn2.chieuDai = 6;
        hcn2.chieuRong = 6;

        System.out.println("=== HÌNH CHỮ NHẬT 1 ===");
        hcn1.hienThiThongTin();

        System.out.println("\n=== HÌNH CHỮ NHẬT 2 ===");
        hcn2.hienThiThongTin();
	}

}
