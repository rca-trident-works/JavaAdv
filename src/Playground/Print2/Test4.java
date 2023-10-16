package Playground.Print2;

class A4 {
    A4() {
        System.out.println("コンストラクタA4");
    }
}

class B4 extends A4 {
    String val;

    B4(String ival) {
        val = ival;
        System.out.println(val);
    }
}

public class Test4 {
    public static void main(String[] args) {
        B4 b = new B4("あああああ");
    }
}