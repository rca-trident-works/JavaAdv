interface SimpleInterface {
    public int doSomething(int n);
}

public class LambdaExample {
    static void printout(SimpleInterface s) {
        System.out.println(s.doSomething(2));
    }

    public static void main(String[] args) {
        printout(n -> n + 1);
    }
}
