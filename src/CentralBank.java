public class CentralBank {
    int getInterestRate() {
        return 0;
    }
}
class BOC extends CentralBank {
    @Override
    int getInterestRate() {
        return 8;
    }
}
class PeoplesBank extends CentralBank {
    @Override
    int getInterestRate() {
        return 10;
    }
}
class ComBank extends CentralBank {
    @Override
    int getInterestRate() {
        return 12;
    }
}
class TestOverriding {
    public static void main(String[] args) {
        BOC b = new BOC();
        PeoplesBank p = new PeoplesBank();
        ComBank c = new ComBank();
        System.out.println("BOC Interest Rate : " + b.getInterestRate() + "%");
        System.out.println("Peoples Bank Interest Rate : " + p.getInterestRate() + "%");
        System.out.println("ComBank Interest Rate : " + c.getInterestRate() + "%");
    }
}