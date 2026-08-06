package baitaplab5_8cthuchanh;
import java.util.ArrayList;
import java.util.Collections;
public class MemoryGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Card> cards = new ArrayList<>();

        // Tạo 8 cặp bài
        for (int i = 1; i <= 8; i++) {
            cards.add(new Card(i));
            cards.add(new Card(i));
        }

        // Xáo trộn
        Collections.shuffle(cards);

        // Hiển thị các lá bài
        System.out.println("Danh sách bài sau khi xáo trộn:");

        for (int i = 0; i < cards.size(); i++) {
            System.out.print(cards.get(i).giaTri + " ");
        }

        System.out.println();

        // Lật thử 2 lá đầu
        Card c1 = cards.get(0);
        Card c2 = cards.get(1);

        c1.daLat = true;
        c2.daLat = true;

        if (c1.giaTri == c2.giaTri) {
            System.out.println("Hai lá giống nhau!");
        } else {
            System.out.println("Hai lá khác nhau!");
        }
    }

}
