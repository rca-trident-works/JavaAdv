package ReviewObj;

class Car3 {
    String name;
    double gas;
    int num;

    Car3(String name, double gas, int num) {
        this.name = name;
        this.gas = gas;
        this.num = num;
    }

    void showInfo() {
        System.out.print("車種: " + name);
        System.out.print("\t\t排気量: " + gas);
        System.out.println("\t\tナンバー: " + num);
    }
}

public class Car3Main {
    public static void main(String[] args) {
        Car3 car1 = new Car3("車1", 5.0, 1234);
        car1.showInfo();

        Car3 car2 = new Car3("Car2", 4.0, 5678);
        car2.showInfo();

        Car3 car3 = new Car3("3.車", 3.0, 9012);
        car3.showInfo();
    }
}
