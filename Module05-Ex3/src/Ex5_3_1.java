import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }
    void showInfo() {
        System.out.println(name + age + "才");
    }

    public int compareTo(Person p) {
        return this.age - p.age;
    }
}

public class Ex5_3_1 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("レオナルド・ディカプリオ", 46));
        list.add(new Person("ブラッド・ピット", 58));
        list.add(new Person("マット・デイモン", 51));
        list.add(new Person("トム・ハンクス", 66));

        for (Person item : list) {
            item.showInfo();
        }

        System.out.println("年齢順に並べ替え");
        Collections.sort(list);
        for (Person item : list) {
            item.showInfo();
        }
    }
}
