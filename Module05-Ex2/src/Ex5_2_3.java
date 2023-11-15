import java.util.HashMap;
import java.util.Scanner;

public class Ex5_2_3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ctrl+Zキーで終了します");
        System.out.println("番号を入力してください");

        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (map.containsKey(num)) {
                System.out.println("重複しています");
                System.out.println("番号を入力してください");
            } else {
                System.out.println("名前を入力してください");
                String name = sc.next();
                map.put(num, name);
                System.out.println("番号を入力してください");
            }
        }

        System.out.println(map.entrySet());
        sc.close();
    }
}
