package ReviewObj;

class Shikaku {
    String dai1;
    String dai2;
    String dai3;
    String name;

    Shikaku(String idai1, String idai2, String idai3) {
        dai1 = idai1;
        dai2 = idai2;
        dai3 = idai3;
    }

    Shikaku(String idai1, String idai2) {
        dai1 = idai1;
        dai2 = idai2;
        dai3 = "なし";
    }

    Shikaku(String idai1) {
        dai1 = idai1;
        dai2 = "なし";
        dai3 = "なし";
    }

    void showShikaku() {
        System.out.println("【目標】" +  name);
        System.out.println("第1優先: " + dai1);
        System.out.println("第2優先: " + dai2);
        System.out.println("第3優先: " + dai3);
    }
}
public class ShikakuMain {
    public static void main(String[] args) {
        Shikaku c1 = new Shikaku("SG", "FE", "Java");
        c1.name = "佐藤";
        c1.showShikaku();

        Shikaku c2 = new Shikaku("SG", "FE");
        c2.name = "鈴木";
        c2.showShikaku();

        Shikaku c3 = new Shikaku("AP");
        c3.name = "田中";
        c3.showShikaku();
    }
}
