interface Calculator {
    int calculate(int a, int b);
}

class Calc implements Calculator {
    public int calculate(int a, int b) {
        return a + b;
    }
}

public class Ex6_2_1 {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        int result = calculator.calculate(5, 7);
        System.out.println("合計: " + result);
    }
}
