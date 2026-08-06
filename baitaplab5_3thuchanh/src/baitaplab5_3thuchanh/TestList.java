package baitaplab5_3thuchanh;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Vector<String> vector = new Vector<>();

        // Thêm dữ liệu
        arrayList.add("Java");
        linkedList.add("Python");
        vector.add("C++");

        // Hiển thị
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Vector: " + vector);

        // Truy cập phần tử
        System.out.println("\nPhần tử đầu tiên:");
        System.out.println("ArrayList: " + arrayList.get(0));
        System.out.println("LinkedList: " + linkedList.get(0));
        System.out.println("Vector: " + vector.get(0));
	}

}
