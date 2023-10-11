package ReviewObj;

import java.util.Scanner;

class Sale {
    String name;
    int price;
    Sale(String iname, int iprice) {
        name = iname;
        price = iprice;
    }

    void showPrice() {
        System.out.println(name + "の定価は" + price + "円です");
    }

    void showPrice(int rate) {
        System.out.println("【特価】" + rate + "%引きで" + (price - price * rate / 100) + "円になります。");
    }
}
public class SaleMain {
    public static void main(String[] args) {
        Sale s = new Sale("セーター", 5000);
        s.showPrice();
        Scanner sc = new Scanner(System.in);
        System.out.println("値引き率(%)を入力してください。");
        int rate = sc.nextInt();
        s.showPrice(rate);
        sc.close();
    }
}
