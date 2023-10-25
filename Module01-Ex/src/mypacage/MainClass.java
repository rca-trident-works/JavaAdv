package mypacage;

import pacagea.ClassA;

public class MainClass {
    public static void main(String[] args) {
        ClassA ca = new ClassA();
        ca.publicField = 13;
        ca.publicMethod();

        ca.privateMethod();
    }
}
