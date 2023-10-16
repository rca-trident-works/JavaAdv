package Playground.Print2;

class Trident {
    void methodA() {
        System.out.println("TSIT");
    }
}

class Jouhoukei extends Trident {
    void methodB() {
        System.out.println("情報系");
    }
}

class Creative extends Trident {
    void methodC() {
        System.out.println("クリエイティブ系");
    }
}

class SF2 extends Jouhoukei {
    void methodD() {
        System.out.println("SF2");
    }
}

public class Test1 {
    public static void main(String[] args) {
        SF2 s = new SF2();
        s.methodA();
        s.methodB();
        // Error ↓
        // s.methodC();
        s.methodD();

    }
}
