package ReviewMethod3;

public class KadaiR1 {

    // スリープ（一時停止）
    //  0.5秒ごとに1回、2回・・・50回と表示する。
    //  ただし、３の倍数の時、３が数字につく場合は「ワン」も表示する。
    //  ワンを表示する箇所）３，６，９・・・・・１３，２３，・・・３０，３１・・・・

    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 50; i++) {
                System.out.print(i + "回");
                if (i % 3 == 0) {
                    System.out.print("\tワン");
                } else if (Integer.toString(i).contains("3")) {
                    System.out.print("\tワン");
                }
                System.out.println();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
