package ReviewObj;

class Car2 {
    String name;
    double gas;
    int num;

    Car2() {
        name = "くるま";
        gas = 1.0;
        num = 5555;
    }

    void showInfo() {
        System.out.print("車種: " + name);
        System.out.print("\t\t排気量: " + gas);
        System.out.println("\t\tナンバー: " + num);
    }
}

public class Car2Main {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        car1.showInfo();
    }
}
