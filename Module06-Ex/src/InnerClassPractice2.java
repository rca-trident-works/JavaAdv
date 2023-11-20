public class InnerClassPractice2 {
    public static void main(String[] args) {
        class InnerThread extends Thread {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("InnerThread 実行中: " + i);
                }
            }
        }

        InnerThread inner = new InnerThread();
        inner.start();
    }
}
