import java.io.*;

public class Ex7_1_2 {
    public static void main(String[] args) {
        // 円の面積 BufferedReaderを使って半径を入力する Math.PIとMath.powを使って面積を計算する
        System.out.print("半径を入力してください。 >");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
            double r = Double.parseDouble(str);
            double area = Math.PI * Math.pow(r, 2);
            System.out.println("円の半径: " + r);
            System.out.println("円の面積: " + area);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("正しい数字を入力してください。");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
