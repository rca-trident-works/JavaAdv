class MyThreadImp1 implements Runnable {
    public int num1 = 0;

    @Override
    public void run() {
        for (num1 = 0; SimpleThreadInterface.count < 100; num1++) {
            System.out.println("MyThreadImp1のrunメソッドでcountを加算(" + num1 + ")");
            if (SimpleThreadInterface.count < 100) {
                SimpleThreadInterface.count++;
            }
        }
    }
}

class MyThreadImp2 implements Runnable {
    public int num2 = 0;

    @Override
    public void run() {
        for (num2 = 0; SimpleThreadInterface.count < 100; num2++) {
            System.out.println("MyThreadImp2のrunメソッドでcountを加算(" + num2 + ")");
            if (SimpleThreadInterface.count < 100) {
                SimpleThreadInterface.count++;
            }
        }
    }
}

public class SimpleThreadInterface {
    public static int count = 0;
    public static void main(String[] args) {
        MyThreadImp1 threadImp1 = new MyThreadImp1();
        MyThreadImp2 threadImp2 = new MyThreadImp2();
        Thread thread1 = new Thread(threadImp1);
        Thread thread2 = new Thread(threadImp2);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("最後のCountは" + count);
        System.out.println("Count内の、MyThreadImp1で加算した回数は" + threadImp1.num1);
        System.out.println("Count内の、MyThreadImp2で加算した回数は" + threadImp2.num2);
    }
}
