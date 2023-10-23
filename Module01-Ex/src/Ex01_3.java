import java.util.Scanner;

public class Ex01_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.println(">");
            // エンターキーの入力待ち
            input = scanner.nextLine();
            // 入力された文字を表示する
            System.out.println(input);
            // 改行以外の入力があれば（文字の長さが0でなければ）、入力を繰り返す
        } while (!input.isEmpty());
        System.out.println("処理完了");
        scanner.close();
    }
}
