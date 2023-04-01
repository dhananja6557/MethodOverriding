public class Human {
    void run() {
        System.out.println("Human can eat!");
    }
}
class Dhana extends Human {
    void run() {
        System.out.println("Dhana can eat!");
    }
    public static void main(String[] args) {
        Dhana d = new Dhana();
        d.run();
    }
}