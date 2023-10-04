package ReviewMethod2;

import java.util.Scanner;

public class PracticeMethod4 {

    // 問4
    //  2 つの文字列(Hello, と World!)を受け取り、それらの文字列を結合した新しい文字列を 返却するメソッドを定義せよ。
    //  また main メソッドで呼び出し出力結果と同じになるようなコードを作成せよ。
    //  メソッド名:conStrings

    public static String conStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("結合した文字列: " +
                conStrings(scanner.nextLine(), scanner.nextLine()));
        scanner.close();
    }
}
