package Playground.Print2;

class A {
    A() {
        System.out.println("コンストラクタA");
    }
}

class B extends A {
    void show() {
        System.out.println("クラスBです");
    }
}

public class Test2 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
