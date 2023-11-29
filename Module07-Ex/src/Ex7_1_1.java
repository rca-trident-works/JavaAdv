import java.io.*;
import java.util.ArrayList;

public class Ex7_1_1 {
    public static void main(String[] args) {
        System.out.println("連続して数字を入力してください。エンターキーを押したら終了です。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            while (true) {
                System.out.println(">");
                String str = reader.readLine();
                if (str.equals("")) {
                    break;
                }
                int num = Integer.parseInt(str);
                list.add(Integer.valueOf(num));
            }
            int sum = 0;
            for (Integer i : list) {
                System.out.print(i + "\t");
                sum += i;
            }
            System.out.print("\t合計は" + sum);
            System.out.print("\t平均は" + (double)sum / list.size());
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("文字が入力されました。");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
