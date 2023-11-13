import java.util.ArrayList;
import java.util.Scanner;

public class Ex5_1_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("繰り返し何か入力してください。");
        System.out.print("「end」と入力したら終わりです。");
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.equals("end")) {
                break;
            }
            list.add(s);
        }
        System.out.println("入力された内容の一覧です");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
