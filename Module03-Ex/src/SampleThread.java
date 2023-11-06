import java.util.SimpleTimeZone;

class MyThread1 extends Thread {
    public  int num1 = 0;

    @Override
    public void run() {
        for (num1 = 0; SampleThread.count < 100; num1++) {
            System.out.println("MyThread1のrunメソッドでcountを加算(" + num1 + ")");
            if (SampleThread.count < 100) {
                SampleThread.count++;
            }
        }
    }
}

class MyThread2 extends Thread {
    public  int num2 = 0;

    @Override
    public void run() {
        for (num2 = 0; SampleThread.count < 100; num2++) {
            System.out.println("MyThread2のrunメソッドでcountを加算(" + num2 + ")");
            if (SampleThread.count < 100) {
                SampleThread.count++;
            }
        }
    }
}

public class SampleThread {
    public static int count = 0;
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
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
        System.out.println("Count内の、MyThread1で加算した回数は" + thread1.num1);
        System.out.println("Count内の、MyThread2で加算した回数は" + thread2.num2);

    }
}
