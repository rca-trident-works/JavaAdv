package ReviewMethod2;

import java.util.Scanner;
public class PracticeMethod3 {

    // 問3
    //  1つの整数を受け取り、その整数が偶数かどうか判定するメソッドを定義せよ。
    //  また main メソッドで呼び出し出力結果と同じになるようなコードを作成せよ。
    //  メソッド名:isEven

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        System.out.println(inputNum + "は偶数かどうか: " + isEven(inputNum));
    }
}
