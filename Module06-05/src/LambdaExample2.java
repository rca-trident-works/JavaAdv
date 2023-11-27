public class LambdaExample2 {
    static void printout(SimpleInterface s) {
        System.out.println(s.doSomething(2));
    }

    public static void main(String[] args) {
        printout(new SimpleInterface() {
            public int doSomething(int n) {
                return n + 1;
            }
        });
    }
}
