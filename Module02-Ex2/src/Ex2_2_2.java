class DivideZeroException extends Exception {
    DivideZeroException(String msg) {
        super(msg);
    }
}

public class Ex2_2_2 {
    public static void main(String[] args) {
        int int1 = 2;
        int int2 = 0;
        try {
            if (int2 == 0) {
                throw new DivideZeroException("0で割り算をしようとしています。");
            }
            int int3 = int1 / int2;
            System.out.println("int1 / int2 = " + int3);
        }
        catch (DivideZeroException e) {
            System.out.println(e);
        }
    }
}
