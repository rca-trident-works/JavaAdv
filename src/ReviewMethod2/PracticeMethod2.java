package ReviewMethod2;

import java.util.Scanner;

public class PracticeMethod2 {

    // 問2
    //  2つの整数を受け取り、その合計値(整数)を返却するメソッドを定義せよ。
    //  また main メソッドで呼び出し出力結果と同じになるようなコードを作成せよ。
    //  メソッド名:add

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("合計: " + add(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }
}
