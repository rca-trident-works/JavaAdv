import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("first name", "太郎");
        map.put("last name", "山田");
        map.put("address", "茨城県つくば市 999-99-99");
        map.put("tel", "029-000-0000");

        System.out.println(map.entrySet());
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.get("first name"));
        System.out.println(map.get("last name"));
        System.out.println(map.get("address"));
        System.out.println(map.get("tel"));
        System.out.println(map.get("e-mail"));

        System.out.println("☆キーと値");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("☆☆値だけなら");
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("☆☆☆エントリーセットからキーと値を出す");
        for (HashMap.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
