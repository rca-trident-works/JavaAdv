package ReviewObj;

class Student {
    String name;
    int mosi1;
    int mosi2;
    int mosi3;

    Student(String name, int mosi1, int mosi2, int mosi3) {
        this.name = name;
        this.mosi1 = mosi1;
        this.mosi2 = mosi2;
        this.mosi3 = mosi3;
    }

    double kojinAvg() {
        return (mosi1 + mosi2 + mosi3) / 3.0;
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("鈴木一郎", 80, 68, 82);
        System.out.println(student1.name + "さんの個人平均点: " + student1.kojinAvg());

        Student student2 = new Student("田中たなこ", 48, 52, 69);
        System.out.println(student2.name + "さんの個人平均点: " + student2.kojinAvg());

        Student student3 = new Student("山田太郎", 35, 44, 55);
        System.out.println(student3.name + "さんの個人平均点: " + student3.kojinAvg());

        kamokuAvg(student1, student2, student3);
    }

    static void kamokuAvg(Student s1, Student s2, Student s3) {
        System.out.println("mosi1の平均点: " + (s1.mosi1 + s2.mosi1 + s3.mosi1) / 3.0);
        System.out.println("mosi2の平均点: " + (s1.mosi2 + s2.mosi2 + s3.mosi2) / 3.0);
        System.out.println("mosi3の平均点: " + (s1.mosi3 + s2.mosi3 + s3.mosi3) / 3.0);
    }

}