package ReviewMethod3;

public class KadaiR2 {

    //変数名：　a　　（int型）　0~9の数字をランダムに受け取る
    //変数名：　b　　（int型）　0~9の数字をランダムに受け取る
    //変数名：　c　　（int型）　0~9の数字をランダムに受け取る

    //①	変数a,b,cそれぞれ０～９の数字をランダムに受け取る
    //②	３つの数字を表示する。
    //③	３つの数字がすべて７だったら「大当たり」
    //④	②ではなく、３つの数字が同じだったら「あたり」
    //⑤	２つの数字がいっしょだったら「リーチ」
    //⑥	それ以外だったら「はずれ」

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        if (a == 7 && b == 7 && c == 7) {
            System.out.println("大当たり");
        } else if (a == b && b == c) {
            System.out.println("あたり");
        } else if (a == b || b == c || a == c) {
            System.out.println("リーチ");
        } else {
            System.out.println("はずれ");
        }
    }
}
