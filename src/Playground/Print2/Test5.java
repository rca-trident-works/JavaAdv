package Playground.Print2;

class A5 {
    String val;
    A5() {
        System.out.println("コンストラクタA5");
    }

    A5(String ival) {
        val = ival;
        System.out.println(val);
    }
}

class B5 extends A5 {
    B5(String ival) {
        val = ival;
        System.out.println(val);
    }
}

public class Test5 {
    public static void main(String[] args) {
        B5 b5 = new B5("あああああ");
    }
}
