package bai6_danhsach;

public class Bai6_DanhSach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HocVien hv1 = new HocVien("HV01", "Nguyễn Văn A", 2003, "Nam");
	        HocVien hv2 = new HocVien("HV02", "Trần Thị B", 2001, "Nữ");
	        HocVien hv3 = new HocVien("HV03", "Lê Văn C", 2002, "Nam");

	        HocVien[] ds = {hv1, hv2, hv3};

	        System.out.println("===== DANH SÁCH HỌC VIÊN =====");

	        for (HocVien hv : ds) {
	            hv.hienThi();
	            System.out.println("--------------------------");
	        }

	        HocVien lonTuoiNhat = ds[0];

	        for (int i = 1; i < ds.length; i++) {
	            if (ds[i].getNamSinh() < lonTuoiNhat.getNamSinh()) {
	                lonTuoiNhat = ds[i];
	            }
	        }

	        System.out.println("\n===== HỌC VIÊN NHIỀU TUỔI NHẤT =====");
	        lonTuoiNhat.hienThi();
	}

}
