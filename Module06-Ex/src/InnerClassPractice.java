public class InnerClassPractice {
    public static void main(String[] args) {
        class Inner {
            void showMessage() {
                System.out.println("内部クラスのshowMessageメソッドの呼び出し");
            }
        }

        Inner inner = new Inner();
        inner.showMessage();
        System.out.println("プログラムを終了します。");
    }
}
