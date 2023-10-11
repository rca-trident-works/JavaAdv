package ReviewObj;

class Curry {
    String name;
    String topping;
    int price;

    Curry(String iname, String itopping, int iprice) {
        name = iname;
        topping = itopping;
        price = iprice;
    }
    Curry(String iname, int iprice) {
        name = iname;
        topping = "ありません";
        price = iprice;
    }

    void showCurry() {
        System.out.println("【" + name + "カレー】トッピングは "+ topping + " " + price + "円");
    }
}

public class CurryMain {
    public static void main(String[] args) {
        Curry c1 = new Curry("ポーク", "ロースカツ", 680);
        c1.showCurry();

        Curry c2 = new Curry("ビーフ", 580);
        c2.showCurry();
    }
}
