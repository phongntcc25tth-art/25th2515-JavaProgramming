package baitaplab5_5bthuchanh;
import java.util.ArrayList;
import java.util.Scanner;
public class XuLyDanhSachSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList<>();

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        // Nhập danh sách
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            ds.add(sc.nextInt());
        }

        System.out.println("Danh sách ban đầu: " + ds);

        // Loại bỏ số trùng lặp
        ArrayList<Integer> khongTrung = new ArrayList<>();
        for (int x : ds) {
            if (!khongTrung.contains(x)) {
                khongTrung.add(x);
            }
        }
        System.out.println("Danh sách không trùng: " + khongTrung);

        // Tìm số lớn thứ 2
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int x : khongTrung) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1) {
                max2 = x;
            }
        }

        System.out.println("Số lớn thứ 2: " + max2);

        // Tính trung bình cộng số chẵn
        int tongChan = 0, demChan = 0;

        for (int x : ds) {
            if (x % 2 == 0) {
                tongChan += x;
                demChan++;
            }
        }

        if (demChan > 0) {
            System.out.println("Trung bình số chẵn: "
                    + (double) tongChan / demChan);
        } else {
            System.out.println("Không có số chẵn.");
        }

        // Tách danh sách chẵn và lẻ
        ArrayList<Integer> chan = new ArrayList<>();
        ArrayList<Integer> le = new ArrayList<>();

        for (int x : ds) {
            if (x % 2 == 0) {
                chan.add(x);
            } else {
                le.add(x);
            }
        }

        System.out.println("Danh sách chẵn: " + chan);
        System.out.println("Danh sách lẻ: " + le);

        // Đảo ngược danh sách
        ArrayList<Integer> daoNguoc = new ArrayList<>();

        for (int i = ds.size() - 1; i >= 0; i--) {
            daoNguoc.add(ds.get(i));
        }

        System.out.println("Danh sách đảo ngược: " + daoNguoc);

        sc.close();
	}

}
