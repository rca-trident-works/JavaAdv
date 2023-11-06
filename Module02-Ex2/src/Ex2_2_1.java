public class Ex2_2_1 {
    public static void main(String[] args) {
        int age1 = 200;
        try {
            if (age1 < 0 || age1 >= 150) {
                throw new Exception("不正な年齢が設定されています。");
            }
            System.out.println("年齢は" + age1 + "歳ですね。");
        }
        catch (Exception e) {
            System.out.println("例外が発生しました");
            System.out.println(e);
        }
    }
}

/*
 *
 * Errorクラス：重大な実行時問題でCatchすべきではない(のでそもそもできない)もの
 * Exceptionクラス：実行時例外例外で、Catchする必要があるもの
 * RuntimeExceptionクラス：Exceptionのうち、Catchが任意であるもの
 * Throwableクラス：ErrorやExceptionなどスーパークラス
 *
 *  */