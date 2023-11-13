import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<String>();

        months.add("January");
        months.add("February");
        months.add("March");

        System.out.println("要素数: " + months.size());
        for (String month : months) {
            System.out.println(month);
        }

        months.remove(1);
        System.out.println("要素数: " + months.size());
        for (String month : months) {
            System.out.println(month);
        }
    }
}
