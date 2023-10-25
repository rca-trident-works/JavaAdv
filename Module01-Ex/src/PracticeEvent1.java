import java.awt.AWTException;
//　AWT(Abstract Window Toolkit)例外
import java.awt.Robot;
// 入力デバイスのイベントをシミュレートするためのクラス(自動テスト, 自動デモなど)
import java.awt.Toolkit;
// すべてのAWT実装の抽象クラス
import java.awt.event.InputEvent;
// マウスやキーボードのイベントを扱うためのクラス(BUTTON1_DOWN_MASKのようなフィールドを持つ)
import java.util.Scanner;

public class PracticeEvent1 {
    public static void main(String[] args) throws AWTException {
        Scanner in = new Scanner(System.in);
        Robot robot = new Robot();

        // 画面の幅を代入
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        // 画面の高さを代入
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        // mouseMove() マウスの位置を設定するメソッド
        // マウスの位置を中心に
        robot.mouseMove(screenWidth / 2, screenHeight / 2);
        robot.delay(500);

        // Windowsボタンを押してみる
        robot.mouseMove(30, screenHeight - 20);

        // ブレイクポイントを使用して止めてもいいですが、Scannerで許可を求めるように
        System.out.println("本当にクリックしても大丈夫ですか？(y/n)");
        String yn = in.next();
        if (yn.equals("y")) {
            // Windowsボタンを押してみる
            robot.mouseMove(30, screenHeight - 20);

            // 左クリックを押し、離す処理
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }
        else {
            System.out.println("クリックしない");
        }
        in.close();
    }
}
