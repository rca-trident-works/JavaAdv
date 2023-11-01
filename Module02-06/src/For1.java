public class For1 {
    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
