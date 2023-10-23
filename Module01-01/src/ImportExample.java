import java.util.*;

public class ImportExample {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        double dnum = rand.nextDouble();
        System.out.println(dnum);
        int inum1 = rand.nextInt();
        System.out.println(inum1);
        int inum2 = rand.nextInt(10);
        System.out.println(inum2);
    }
}
