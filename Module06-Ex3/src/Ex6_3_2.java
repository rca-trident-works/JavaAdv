import java.util.ArrayList;

public class Ex6_3_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("おはよう");
        list.add("こんにちは");
        list.add("Hello!");
        list.add("Good morning");
        list.add("Hi!");

        System.out.println("文字列の長さ順に並べ替え");
        list.sort((s1, s2) -> s1.length() - s2.length());
        list.forEach(s -> System.out.println(s));

    }
}
