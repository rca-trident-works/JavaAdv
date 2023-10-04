package ReviewMethod3;

import java.util.Scanner;
public class PracticeWhile2 {

    // 問2
    //  Math クラスの random()メソッドを使用し、ランダムな数字(0~30)を作成し、 コンソールに数値を入力。
    //  ランダムな数字より入力された数値が大きい場合、「違います、もっと大きいです。」
    //  ランダムな数字より入力された数値が小さい場合、「違います、もっと小さいです。」
    //  ランダムな数字と入力された数値が等しい場合、「正解です。」と出力するコードを作成せよ。
    //
    // 出力結果:
    //  ランダムな数字を生成しました。
    //  5
    //  違います、もっと大きいです。
    //  29
    //  違います、もっと小さいです。
    //  14
    //  正解です。

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 31);
        System.out.println("ランダムな数字を生成しました。");
        int inputNum = scanner.nextInt();
        while (randomNum != inputNum) {
            if (randomNum < inputNum) {
                System.out.println("違います、もっと小さいです。");
            } else {
                System.out.println("違います、もっと大きいです。");
            }
            inputNum = scanner.nextInt();
        }
        System.out.println("正解です。");
    }
}
