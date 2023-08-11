package P0803;

// 이 클래스의 객체는 현재 패키지, 다른 패키지 모두 가능
public class AccessModifierTest {
    
    private int a = 1;      // 이 클래스 안에서만 사용 가능 (AccessModifierTest 클래스 안에서만)
    int b = 2;              // 같은 패키지 내에서 어느 클래스나 사용 가능
    public int c = 3;       // 모두 오픈
    
    // public 메서드
    public void printData() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    // default 메서드 : 다른 패키지 사용 불가
    void test1() {
        System.out.println("이 메서드는 같은 패키지에서만 사용가능");
    }
    
}