import java.util.ArrayList;
public class Ex5_1_4 {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<Human>();
        list.add(new Human("青海ひな乃", 23));
        list.add(new Human("赤堀君江", 21));
        list.add(new Human("仲村和泉", 23));
        list.add(new Human("中坂美祐", 18));
        for (Human man : list) man.showInfo();
    }

}
