public class Ex6_2_3 {
    // 匿名クラスとして記述

    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        int result = calculator.calculate(5, 7);
        System.out.println("合計: " + result);
    }
}
