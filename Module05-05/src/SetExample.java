import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        System.out.println(set.add("Jan"));
        System.out.println(set.add("Feb"));
        System.out.println(set.add("Feb"));
        System.out.println(set.add("Mar"));
        System.out.println(set.add("Apr"));

        System.out.println(set);
        System.out.println(set.contains("Jan"));
        System.out.println(set.contains("Jun"));

        for (String txt : set) {
            System.out.println(txt);
        }
    }
}
