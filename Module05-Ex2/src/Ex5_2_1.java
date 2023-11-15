import java.util.HashMap;

public class Ex5_2_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ミラノ風ドリア", 521);
        map.put("マルゲリータピザ", 599);
        map.put("小エビのサラダ", 192);
        map.put("ペペロンチーノ", 582);
        map.put("普通のハンバーグ", 602);

        for (String key : map.keySet()) {
            System.out.println(key + "\t:" + map.get(key) + "kcal");
        }
    }
}
