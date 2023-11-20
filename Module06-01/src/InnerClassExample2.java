class Outer2 {
    private String message = "Outerクラスのprivateインスタンス変数です";

    class Inner {
        void print() {
            System.out.println("Innerクラスのprintメソッドが呼ばれました");
            System.out.println(message);
        }
    }
    void doSomething() {
        Inner inner = new Inner();
        inner.print();
    }
}
public class InnerClassExample2 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.doSomething();
    }
}
