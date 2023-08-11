package P0803.test;

import P0803.AccessModifierTest;

public class AccessModifierTestMain {
    public static void main(String[] args) {
        AccessModifierTest ac = new AccessModifierTest();
        
        // ac.a = 10;   // why not? --> private 이어서.
        // ac.b = 20;   // why not? --> default : 패키지 밖에선 안보임
        ac.c = 30;

        ac.printData(); // public
        // ac.test1();  // default
    }
}
