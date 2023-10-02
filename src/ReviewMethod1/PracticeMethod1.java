package ReviewMethod1;

public class PracticeMethod1 {
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        int result = calculateSum(5, 7);
        System.out.println("合計は:" + result);
    }
}