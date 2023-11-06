public class SleepExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.print("*");
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}