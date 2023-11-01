package mypacage;

import pacagea.ClassA;

public class MainClass {
    public static void main(String[] args) {
        ClassA ca = new ClassA();
        ca.publicField = 13;

        ca.setPrivateField("aaaaa");

        System.out.println(ca.publicField);
        System.out.println(ca.getPrivateField());

        ca.publicMethod();
        ca.privateMethod();
    }
}
