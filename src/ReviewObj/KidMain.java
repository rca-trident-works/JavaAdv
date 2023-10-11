package ReviewObj;
import java.util.Random;

class Kid {
    String name;
    Kid(String iname) {
        name = iname;
    }

    void janken() {
        Random rand = new Random();
        int num = rand.nextInt(3);
        if (num == 0) {
            System.out.println(name + ": グー");
        } else if (num == 1) {
            System.out.println(name + ": チョキ");
        } else {
            System.out.println(name + ": パー");
        }
    }
}
public class KidMain {
    public static void main(String[] args) {
        Kid k1 = new Kid("百　田");
        Kid k2 = new Kid("玉　井");
        Kid k3 = new Kid("佐々木");
        Kid k4 = new Kid("有　安");
        Kid k5 = new Kid("高　城");
        k1.janken();
        k2.janken();
        k3.janken();
        k4.janken();
        k5.janken();
    }
}
