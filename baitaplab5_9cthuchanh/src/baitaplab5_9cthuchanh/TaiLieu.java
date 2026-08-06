package baitaplab5_9cthuchanh;
import java.util.ArrayList;
public class TaiLieu {
	 String maTL;
	    String tenTL;

	    TaiLieu(String maTL, String tenTL) {
	        this.maTL = maTL;
	        this.tenTL = tenTL;
	    }
	}

	class ThanhVien {
	    String maTV;
	    String tenTV;
	    ArrayList<TaiLieu> dsMuon = new ArrayList<>();

	    ThanhVien(String maTV, String tenTV) {
	        this.maTV = maTV;
	        this.tenTV = tenTV;
	    }

	    void muonTaiLieu(TaiLieu tl) {
	        dsMuon.add(tl);
}
}