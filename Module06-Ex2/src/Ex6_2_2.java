public class Ex6_2_2 {
    public static void main(String[] args) {
        class Calc implements Calculator {
            public int calculate(int a, int b) {
                return a + b;
            }
        }

        Calc calculator = new Calc();
        int result = calculator.calculate(5, 7);
        System.out.println("合計: " + result);
    }
}
