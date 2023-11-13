import java.util.ArrayList;

class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println(name + age + "才");
    }
}

public class Ex5_1_3 {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<Human>();
        list.add(new Human("青海ひな乃", 23));
        list.add(new Human("赤堀君江", 21));
        list.add(new Human("仲村和泉", 23));
        list.add(new Human("中坂美祐", 18));
        for (int i = 0; i < list.size(); i++) {
            Human man = list.get(i);
            man.showInfo();
        }
    }

}
