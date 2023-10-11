package ReviewObj;

interface Animal {
    void eat();
    void move();
}

class Lion implements Animal {
    public void eat() {
        System.out.println("ライオンが肉を食べています");
    }
    public void move() {
        System.out.println("ライオンが走っています");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("ねこちゃんがキャットフードを食べています");
    }
    public void move() {
        System.out.println("ねこちゃんは寝ています");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal lion = new Lion();
        showAnimal(lion);

        Animal cat = new Cat();
        showAnimal(cat);
    }
    static void showAnimal(Animal animal) {
        animal.eat();
        animal.move();
    }
}
