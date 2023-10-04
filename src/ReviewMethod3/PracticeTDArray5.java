package ReviewMethod3;

// 問5
//  [二次元配列の演習]以下のコードを打ち込み。
//  各ステートメント(各行)がどのような処理をしているかコメントアウトを使い、入力せよ。

public class PracticeTDArray5 { //例　クラス定義
    public static int calculateMatrixSum(int[][] matrix) {//例 合計を計算
        int sum = 0; // int型変数`sum`を定義, 0で初期化
        for (int row = 0; row < matrix.length; row++) { // 二次元配列の行数分ループ
            for (int col = 0; col < matrix[row].length; col++) { // 二次元配列の列数分ループ
                sum += matrix[row][col]; // sumに二次元配列の各要素を加算
            }
        }
        return sum; // sumを返却
    }
    public static void main(String[] args) {
        int[][] matrix = { // 二次元配列を定義
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
        int totalSum = calculateMatrixSum(matrix); // 二次元配列の合計を計算するメソッド:calculateMatrixSumを呼び出し、結果を`totalSum`に代入
        System.out.println("二次元配列の合計は: " + totalSum); // 二次元配列の合計を出力
    }
}
