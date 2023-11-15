import java.util.HashSet;
import java.util.Scanner;

public class Ex5_2_4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("文字列を入力してください ⇒ \n (複数入力する場合は半角スペースで区切ってください)");

        String input = sc.nextLine();
        String[] words = input.split(" ");

        for (String word : words) {
            if (set.contains(word)) {
                System.out.println(word + "は重複しています");
            } else {
                set.add(word);
            }
        }

        System.out.println("******setの中******");
       for (String s : set) {
           System.out.println(s);
       }
       sc.close();
    }
}
