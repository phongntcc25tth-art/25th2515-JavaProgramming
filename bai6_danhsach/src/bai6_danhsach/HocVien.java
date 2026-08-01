package bai6_danhsach;

public class HocVien {

	    private String maHV;
	    private String hoTen;
	    private int namSinh;
	    private String gioiTinh;

	    public HocVien() {
	    }

	    public HocVien(String maHV, String hoTen, int namSinh, String gioiTinh) {
	        this.maHV = maHV;
	        this.hoTen = hoTen;
	        this.namSinh = namSinh;
	        this.gioiTinh = gioiTinh;
	    }

	    public String getMaHV() {
	        return maHV;
	    }

	    public void setMaHV(String maHV) {
	        this.maHV = maHV;
	    }

	    public String getHoTen() {
	        return hoTen;
	    }

	    public void setHoTen(String hoTen) {
	        this.hoTen = hoTen;
	    }

	    public int getNamSinh() {
	        return namSinh;
	    }

	    public void setNamSinh(int namSinh) {
	        this.namSinh = namSinh;
	    }

	    public String getGioiTinh() {
	        return gioiTinh;
	    }

	    public void setGioiTinh(String gioiTinh) {
	        this.gioiTinh = gioiTinh;
	    }

	    public void hienThi() {
	        System.out.println("Mã học viên : " + maHV);
	        System.out.println("Họ tên      : " + hoTen);
	        System.out.println("Năm sinh    : " + namSinh);
	        System.out.println("Giới tính   : " + gioiTinh);
	    }
}
