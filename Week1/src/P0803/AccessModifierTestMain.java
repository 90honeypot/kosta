package P0803;

public class AccessModifierTestMain {
    public static void main(String[] args) {
        AccessModifierTest ac = new AccessModifierTest();
        
        //ac.a = 10; why? --> private 이어서.
        ac.b = 20;
        ac.c = 30;

        ac.printData();
        ac.test1();
    }
}
