package ReviewMethod3;
import java.util.Random;

public class KadaiR4 {

    //①	1000個の要素を持つ 配列a の全要素に「3」を格納する
    //②	０以上1000未満の乱数を１つ求め、その値をインデックスとする要素に「2」を上書きする。
    //③	配列a の全要素を１行に50個ずつ表示する。
    //④	３秒待つ
    //⑤	答えを表示する。

    public static void main(String[] args) throws InterruptedException {
        int[] a = new int[1000];
        for (int i = 0; i < a.length; i++) {
            a[i] = 3;
        }
        Random rand = new Random();
        int num = rand.nextInt(1000);

        a[num] = 2;
        System.out.println("2 をさがしてください。制限時間は3秒です。");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
            if(i % 50 == 49){
                System.out.println();
            }
        }

        Thread.sleep(3000);
        System.out.println("答えは" + num + "番目です。");
    }

}
