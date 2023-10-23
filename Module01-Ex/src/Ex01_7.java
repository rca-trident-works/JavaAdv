public class Ex01_7 {
    public static void main(String[] args) {
        String text1 = "愛知県 名古屋市 中村区 名駅 3-24-15";
        String[] text2 = text1.split(" ");
        for (String text3 : text2) {
            System.out.println("[" + text3 + "]");
        }
    }
}
