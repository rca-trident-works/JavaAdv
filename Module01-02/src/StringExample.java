public class StringExample {
    public static void main(String[] args) {
        String s1 = new String("こんにちは");
        String s2 = new String("こんにちは");
        System.out.println(s1 == s2);

        String str = "Javaの学習";
        System.out.println(str.length());
        System.out.println(str.indexOf("学習"));
        System.out.println(str.indexOf("Ruby"));
        System.out.println(str.contains("学習"));
        System.out.println(str.contains("Ruby"));

        String str2 = "2023/10/23";
        String[] item = str2.split("/");
        for (String s : item) {
            System.out.println(s);
        }
    }
}
