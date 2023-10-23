public class Ex01_8 {
    public static void main(String[] args) {
        String text1 = "192.168.1.255";
        String[] text2 = text1.split("\\.");
        for (String text3 : text2) {
            System.out.println("[" + text3 + "]");
        }
    }
}
