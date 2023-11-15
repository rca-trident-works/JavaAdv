import java.util.HashMap;

public class Ex5_2_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 100);
        map.put("banana", 150);
        map.put("cherry", 200);

        // ③
        System.out.println(map.get("cherry"));

        // ④
        System.out.println(map.containsKey("grape") ? "grapeは存在します" : "grapeは存在しません");

        // ⑤
        map.replace("banana", 50);

        // ⑥
        map.put("kiwi", 50);

        // ⑦
        map.remove("apple");

        // ⑧
        for (String key : map.keySet()) {
            System.out.println(key + "\t:" + map.get(key) + "円");
        }
    }
}
