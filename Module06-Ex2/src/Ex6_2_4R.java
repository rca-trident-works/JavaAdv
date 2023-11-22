public class Ex6_2_4R {
    public static void main(String[] args) {
        Operation addition = (
                (a, b) -> {
                    return a + b;
                }
        );

        Operation subtraction = (
                (a, b) -> {
                    return a - b;
                }
        );

        System.out.println(addition.perform(100, 32));
        System.out.println(subtraction.perform(100, 32));
    }
}
