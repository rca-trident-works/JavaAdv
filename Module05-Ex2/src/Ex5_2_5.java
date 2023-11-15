import java.util.ArrayList;
import java.util.Iterator;

public class Ex5_2_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ミッキーマウス");
        list.add("ミニーマウス");
        list.add("ドナルドダック");
        list.add("デイジーダック");
        list.add("プルート");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String txt = it.next();
            System.out.println(txt);
        }
    }
}
