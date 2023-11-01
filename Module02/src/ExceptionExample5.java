class SimpleClass {
    void doSomething() {
        int array[] = new int[3];
        array[10] = 99;
    }
}

public class ExceptionExample5 {
    public static void main(String[] args) {
        SimpleClass sc = new SimpleClass();
        try {
            sc.doSomething();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("例外をキャッチしました");
            System.out.println(e);
        }
    }
}
