package ReviewMethod2;

import java.util.Scanner;
public class PracticeMethod7 {

    // 問7
    //  Scanner クラスを使用し、キーボードから入力された文字列(ひらがな)を受け取り、 その文字列が回文構造かどうかを判定するメソッドを定義せよ。
    //  また main メソッドで呼び出し出力結果と同じになるようなコードを作成せよ。
    //  メソッド名:isPalindrome

    public static boolean isPalindrome(String str) {
        StringBuilder reverseStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr.append(str.charAt(i));
        }
        return str.contentEquals(reverseStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("回文構造かどうか: " + isPalindrome(scanner.nextLine()));
        scanner.close();
    }

    // 問8
    //  メソッドの定義の際に、static 修飾子を付ける理由を考えよう。 コメントアウトにて回答せよ。
    //
    // 回答:
    //  static 修飾子を付けることで、インスタンス化せずにメソッドを呼び出すことができる。
}
