package ReviewMethod1;

public class PracticeMethod4 {
    public static void countCharacters(String inputString) {
        int length = inputString.length();
        System.out.println("文字列の長さは:" + length);
    }

    public static void main(String[] args) {
        String text = "Hello, World!";
        countCharacters(text);
    }
}
