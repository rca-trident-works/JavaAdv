interface Operation {
    int perform(int a, int b);
}

public class Ex6_2_4 {
    public static void main(String[] args) {
        Operation addition = new Operation() {
            @Override
            public int perform(int a, int b) {
                return a + b;
            }
        };

        Operation subtraction = new Operation() {
            @Override
            public int perform(int a, int b) {
                return a - b;
            }
        };

        System.out.println(addition.perform(100, 32));
        System.out.println(subtraction.perform(100, 32));
    }
}
