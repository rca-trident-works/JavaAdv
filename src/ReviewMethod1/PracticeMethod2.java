package ReviewMethod1;

public class PracticeMethod2 {
    public static int countCharacters(String inputString) {
        int length = inputString.length();
        return length;
    }

    public static void main(String[] args) {
        String text = "Hello, World!";
        int length = countCharacters(text);
        System.out.println("文字列の長さは:" + length);
    }
}
