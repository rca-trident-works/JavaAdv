package ReviewObj;

class Jushinsha {
    String name;
    double height;
    double weight;
    void display() {
        System.out.println("◎健康診断の結果◎");
        System.out.println("名前: " + name);
        System.out.println("身長: " + height);
        System.out.println("体重: " + weight);
    }
}

class Jushinsha40 extends Jushinsha {
    double waist;
    void display() {
        super.display();
        System.out.println("腹囲: " + waist);
    }
}
public class JushinshaMain {
    public static void main(String[] args) {
        Jushinsha40 h = new Jushinsha40();
        h.name = "太郎";
        h.height = 160.4;
        h.weight = 60.7;
        h.waist = 82.5;
        h.display();
    }
}
