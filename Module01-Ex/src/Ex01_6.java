import java.util.Scanner;

public class Ex01_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.println(">");
            input = scanner.nextLine();
            System.out.println(input);
        } while (input.contains("END"));
        System.out.println("処理完了");
        scanner.close();
    }
}
