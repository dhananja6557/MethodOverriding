public class Monkey {
    Monkey(){}
    void climb() {
        System.out.println("Using body!");
    }
    void eat() {
        System.out.println("Eating!");
    }
}
class Man extends Monkey {
    Man(){}
    void climb() {
        System.out.println("Using ladder!");
        super.climb();
        super.eat();
    }
}
class TestOutput {
    public static void main(String[] args) {
        Man m = new Man();
        Monkey mky = new Monkey();
        m.climb();
        mky.climb();
    }
}