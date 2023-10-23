public class ImportExample {
    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        double dnum = rand.nextDouble();
        System.out.println(dnum);
        int inum1 = rand.nextInt();
        System.out.println(inum1);
        int inum2 = rand.nextInt(10);
        System.out.println(inum2);
    }
}
