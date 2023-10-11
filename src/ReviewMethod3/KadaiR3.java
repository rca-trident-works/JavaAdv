package ReviewMethod3;

import java.util.Scanner;

public class KadaiR3 {

    //結果

    //級(1~4)を入力してください。
    //1
    //バタフライ
    //背泳ぎ
    //平泳ぎ
    //クロール
    //上記の泳法ができたら1級です

    //級(1~4)を入力してください。
    //2
    //背泳ぎ
    //平泳ぎ
    //クロール
    //上記の泳法ができたら2級です

    //級(1~4)を入力してください。
    //3
    //平泳ぎ
    //クロール
    //上記の泳法ができたら3級です

    //級(1~4)を入力してください。
    //4
    //クロール
    //上記の泳法ができたら4級です

    //級(1~4)を入力してください。
    //8
    //1, 2, 3, 4以外は指定しないでください

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("級(1~4)を入力してください。");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("バタフライ");
            case 2:
                System.out.println("背泳ぎ");
            case 3:
                System.out.println("平泳ぎ");
            case 4:
                System.out.println("クロール");
                System.out.println("上記の泳法ができたら" + num + "級です");
                break;
            default:
                System.out.println("1, 2, 3, 4以外は指定しないでください");
        }
    }
}
