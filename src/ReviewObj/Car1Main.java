package ReviewObj;

class Car1 {
    String name; //車種
    double gas; //排気量
    int num; //ナンバー

    void showInfo(String name, double gas, int num) {
        System.out.print("車種: " + name);
        System.out.print("\t\t排気量: " + gas);
        System.out.println("\t\tナンバー: " + num);
    }
}

public class Car1Main {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.name = "車1";
        car1.gas = 5.0;
        car1.num = 1234;
        car1.showInfo(car1.name, car1.gas, car1.num);

        Car1 car2 = new Car1();
        car2.name = "Car2";
        car2.gas = 4.0;
        car2.num = 5678;
        car2.showInfo(car2.name, car2.gas, car2.num);

        Car1 car3 = new Car1();
        car3.name = "3.車";
        car3.gas = 3.0;
        car3.num = 9012;
        car3.showInfo(car3.name, car3.gas, car3.num);
    }
}
