public class Ex6_2_3 {
    // 匿名クラスとして記述
    static Calculator calculator = new Calculator() {
        public int calculate(int a, int b) {
            return a + b;
        }
    };

    public static void main(String[] args) {
        int result = calculator.calculate(5, 7);
        System.out.println("合計: " + result);
    }
}
