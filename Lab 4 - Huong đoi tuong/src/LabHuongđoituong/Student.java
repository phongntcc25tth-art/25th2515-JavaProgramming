package LabHuongđoituong;

public class Student {
	 private String maSV;
	    private String hoTen;
	    private double diem;

	    public Student(String maSV, String hoTen, double diem) {
	        this.maSV = maSV;
	        this.hoTen = hoTen;
	        this.diem = diem;
	    }

	    public String getXepLoai() {
	        if (diem >= 8)
	            return "Gioi";
	        else if (diem >= 6.5)
	            return "Kha";
	        else if (diem >= 5.0)
	            return "Trung Binh";
	        else
	            return "Yeu";
	    }

	    public void hienThi() {
	        System.out.println("------------------------");
	        System.out.println("Ma SV: " + maSV);
	        System.out.println("Ho ten: " + hoTen);
	        System.out.println("Diem: " + diem);
	        System.out.println("Xep loai: " + getXepLoai());
}
}
