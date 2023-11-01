import java.util.Scanner;

public class Ex2_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("数字を入力してください");
        int num = sc.nextInt();
        try {
            System.out.println(num);
        } catch (NullPointerException e) {
            System.out.println("入力エラーです");
            return;
        } finally {
            System.out.println("finallyブロックです");
        }
        sc.close();
        System.out.println("正常終了");
    }
}
