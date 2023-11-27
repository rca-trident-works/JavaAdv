import java.util.ArrayList;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println(name + age + "才");
    }
}
public class Ex6_3_1 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("レオナルド・ディカプリオ", 46));
        list.add(new Person("ブラッド・ピット", 58));
        list.add(new Person("マット・デイモン", 51));
        list.add(new Person("トム・ハンクス", 66));

        System.out.println("年齢順にソート");
        list.sort((p1, p2) -> p1.age - p2.age);

        list.forEach(p -> p.showInfo());
    }
}
