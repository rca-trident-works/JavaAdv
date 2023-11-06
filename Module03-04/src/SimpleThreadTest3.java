class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThreadのrunメソッド(" + i + ")");
        }
    }
}
public class SimpleThreadTest3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();

        for (int i = 0; i < 100; i++) {
            System.out.println("SimpleThreadTestのmainメソッド(" + i + ")");
        }
    }
}
