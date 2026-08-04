package baitaplab4_4thuchanh;

public class MainMayTinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MayTinh mt = new MayTinh();

        mt.hang = "Dell";
        mt.ram = 16;
        mt.oCung = 512;
        mt.gia = 20000000;

        mt.kiemTraCauHinh();
        System.out.println("Chơi game: " + mt.coTheChoiGame());
        System.out.println("Thuế: " + mt.tinhThue());
	}

}
