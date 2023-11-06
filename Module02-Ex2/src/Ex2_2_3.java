import java.util.Scanner;

class SimpleClass {
    void doSomething() throws ArrayIndexOutOfBoundsException {
        int array[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("数字を入力してください");
        int i = sc.nextInt();
        if (i >= 3) {
            throw new ArrayIndexOutOfBoundsException("配列範囲外");
        }
        array[i] = 99;
        sc.close();
        System.out.println("doSomethingメソッドを終了します");
    }
}

public class Ex2_2_3 {
    public static void main(String[] args) {
        SimpleClass obj = new SimpleClass();
        try {
            obj.doSomething();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
