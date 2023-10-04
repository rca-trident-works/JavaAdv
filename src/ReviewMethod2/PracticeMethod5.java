package ReviewMethod2;

public class PracticeMethod5 {

    // 問5
    //  3 つの整数を受け取り、その中で最小の値を返却するメソッドを定義せよ。
    //  また main メソッドで呼び出し出力結果と同じになるようなコードを作成せよ。
    //  メソッド名:findMin

    public static int findMin(int num1, int num2, int num3) {
        int min = num1;
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("最小値: " + findMin(5, 7, 3));
    }
}
