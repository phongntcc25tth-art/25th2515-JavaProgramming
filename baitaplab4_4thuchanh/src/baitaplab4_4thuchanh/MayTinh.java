package baitaplab4_4thuchanh;

class MayTinh {
    String hang;
    int ram;
    int oCung;
    double gia;

    void kiemTraCauHinh() {
        System.out.println("Hãng: " + hang);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Ổ cứng: " + oCung + " GB");
        System.out.println("Giá: " + gia);
    }

    boolean coTheChoiGame() {
        return ram >= 8;
    }

    double tinhThue() {
        return gia * 0.1;
    }
}
