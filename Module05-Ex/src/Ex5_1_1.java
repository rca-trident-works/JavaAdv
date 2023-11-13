import java.util.ArrayList;
import java.util.Scanner;

public class Ex5_1_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("バナナ");
        list.add("いちご");
        list.add("りんご");

        Scanner sc = new Scanner(System.in);
        System.out.print("0~2を入力してください");
        int num = sc.nextInt();
        String item = list.get(num);
        System.out.println(item);
        sc.close();
    }
}
