package ReviewMethod2;

public class PracticeMethod6 {

    // 問6
    //  整数の配列{1, 1, 2, 3, 5, 8, 13, 8, 5, 3, 2, 1, 1 }を受け取り、その中から最大値を見つけ、 最大値(整数)を返却するメソッドを定義せよ。
    //  また main メソッドで呼び出し出力結果と同じになるようなコードを作成せよ。
    //  メソッド名:findMax

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 8, 13, 8, 5, 3, 2, 1, 1};
        System.out.println("最大値は: " + findMax(array));
    }
}
