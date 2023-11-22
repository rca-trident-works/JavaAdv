public class Ex6_2_3R {
    // 匿名クラスとして記述

    public static void main(String[] args) {
//        Calculator calculator = (a, b) -> a + b;
        Calculator calculator = (a, b) -> {
            return a + b;
        };

        int result = calculator.calculate(5, 7);
        System.out.println("合計: " + result);
    }
}
