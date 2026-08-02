package Lab5_ArrayList;

public class Laptop {
	private String ma;
    private String ten;
    private String hang;
    private double gia;

    public Laptop(String ma, String ten, String hang, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
    }

    public double getGia() {
        return gia;
    }

    public void hienThi() {
        System.out.printf("%-8s %-20s %-12s %,.0f VNĐ\n",
                ma, ten, hang, gia);
}
}