package ReviewMethod3;

public class PracticeFor3 {

    // 問3
    //  1~10 までの数字を画面に表示するプログラムを、for 文を使用し、
    //  ただし、3 の倍数の時、数字の後ろに「は 3 の倍数」を追加して出力するコードを 作成せよ。
    //
    // 出力結果:
    //  1, 2, 3は 3 の倍数,4,5,6は 3 の倍数,7,8,9は 3 の倍数,10

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i % 3 == 0) {
                System.out.print("は3の倍数");
            }
            if (i != 10) {
                System.out.print(", ");
            }
        }
    }
}
