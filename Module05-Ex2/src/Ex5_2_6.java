import java.util.ArrayList;
import java.util.Iterator;

public class Ex5_2_6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ミッキーマウス");
        list.add("ミニーマウス");
        list.add("ドナルドダック");
        list.add("デイジーダック");
        list.add("プルート");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
