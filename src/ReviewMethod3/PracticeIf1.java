package ReviewMethod3;


import java.util.Scanner;

public class PracticeIf1 {

    // 問1
    //  Scanner クラスを使用し、入力された数が偶数の場合は「偶数」、そうでない場合は、 「奇数」、と出力するコードを出力結果と同じになるようなコードを作成せよ。
    //
    //  出力結果:
    //  数値を入力してください:
    //  15
    //  奇数

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("数値を入力してください:");
        if (scanner.nextInt() % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
        scanner.close();
    }
}
