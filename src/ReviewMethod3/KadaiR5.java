package ReviewMethod3;

import java.util.Random;
import java.util.Scanner;

public class KadaiR5 {

    //タイピングの速さを計測するプログラムです。一発勝負です。
    // 間違えたら失格です。10種類の単語の中でどれが出題されるかは乱数で決定します。
    // 以下はmainメソッドの中身です。
    // 下記のないしょの部分を埋めてプログラムを完成させてください。

    public static void main(String[] args) {
        String[] word = { "sea", "sky", "gui", "rom", "ram", "usb", "cpu", "cow", "cat", "dog" };
        Random r = new Random();
        int idx = r.nextInt(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("表示された文字を入力してください");
        // ランダムに選んだ単語を表示する
        System.out.println(word[idx]);
        // タイピングした文字を受け取る
        long t1 = System.nanoTime();
        String moji = sc.next();
        long t2 = System.nanoTime();

        // タイピングした文字とランダムに選んだ単語を比較する
        if (moji.equals(word[idx])) {
            // ms
            System.out.println((t2 - t1) / (1000 * 1000) + "ミリ秒かかりました");
        } else {
            System.out.println("間違っています");
        }
    }
}
