package ReviewMethod3;

public class PracticeArray4 {

    // 問4
    //  int 型の一次元配列 配列名 fibArray {1, 1, 2, 3, 5, 8, 13, 21, 34, 55}を宣言、代入を行い、
    //  出力結果通りにコンソールに出力するコードを作成せよ。
    //
    // 出力結果:
    //  1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    //  ※55 の後ろに読点なし。if(fibArray[i] == 55){ ... の書き方は使わない。

    public static void main(String[] args) {
        int[] fibArray = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        for (int i = 0; i < fibArray.length; i++) {
            System.out.print(fibArray[i]);
            if (i != fibArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
