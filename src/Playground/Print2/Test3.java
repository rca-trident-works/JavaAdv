package Playground.Print2;

class A3 {
    A3() {
        System.out.println("コンストラクタA3");
    }
}

class B3 extends A3 {
    B3() {
        System.out.println("コンストラクタB3");
    }
}

public class Test3 {
    public static void main(String[] args) {
        B3 b = new B3();
    }
}
