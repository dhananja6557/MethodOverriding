public class Mobile {
    public void displayName() {
        System.out.println("Smart Mobile");
    }
}
class Samsung extends Mobile {
    public void displayName() {
        System.out.println("Samsung Galaxy Note 22 ULTRA");
        super.displayName();
    }
}
class Apple extends Samsung {
    public void displayName() {
        System.out.println("iPhone 14 Pro Max");
        super.displayName();
    }
}
class Run {
    public static void main(String[] args) {
        Apple a = new Apple();
        Samsung s = new Samsung();
        s.displayName();
        a.displayName();
    }
}