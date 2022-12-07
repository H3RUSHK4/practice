
public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Bird("raven");
        Bird bird2 = new Bird("pigeon");

        bird1.fly();
        bird2.eat();
        bird1.eat();
        bird2.atack();

        System.out.println(bird1.equals(bird2));
        System.out.println(bird1);
        System.out.println(bird2);

    }
}