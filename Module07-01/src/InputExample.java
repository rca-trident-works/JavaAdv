import java.io.*;

public class InputExample {
    public static void main(String[] args) {
        System.out.println("あなたのお名前は？");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);
        try {
            String name = reader.readLine();
            System.out.println("こんにちは、" + name + "さん");
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
