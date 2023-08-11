package P0802;

public class ExObjectOrientedProgramming {

    /*
        < 객체 지향 프로그래밍 >
         : 객체를 정의하고 객체사이의 관계를 명시하는 프로그래밍
        
         # 객체 정의
          : 기능 명세에서 객체를 도출하고 (그 객체가 갖는 데이터, 기능), 이를 기반으로 클래스 작성
            정의한 클래스로 객체를 생성해서 사용
        
         # 객체 지향 특징
          1. 캡슐화 : 한 객체의 정보를 하나로 묶어서 사용
          2. 코드의 반복 줄임 : 메서드, 상속 등을 활용
          3. 다형성 : 하나의 코드가 상황에 따라 다른 형태로 실행됨 (오버로딩, 오버라이딩)
          4. 유지 보수 편이성
          5. 작업 분담 편함
          6. 컴포턴트 베이스 개발 --> ?? 먼말이지...
          7. 개발 속도 빠르게,
    
        * 클래스 = 멤버변수(객체의 값들 저장) + 메서드(기능)

        * 초기값 설정방법
         1) 멤버변수 선언할 때,
         2) 초기화 블럭
         3) 생성자에서 선언
    */

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(4, 5, "aaa");
        t1.print();
        t2.print();

        MethodTest t3 = new MethodTest();
        t3.hello();
        t3.hello2("Sangwook");
        System.out.println(t3.add(4, 5));
        
    }
}

class Test {
    
    int a = 100;
    int b = 200;
    String name = "AAA";

    Test() {
        System.out.println("생성자 1 "+a+b+name);
        a = 1;
        b = 2;
        name = "ccc";
        System.out.println("생성자 1 "+a+b+name);
    }

    Test(int a, int b, String name) {
        System.out.println("생성자 2 "+this.a+this.b+this.name);
        this.a = a;
        this.b = b;
        this.name = name;
        System.out.println("생성자 2 "+this.a+this.b+this.name);
    }

    void print() {
        System.out.printf("a: %d, b: %d, name: %s\n", a, b, name);
    }
}

class MethodTest {

    int a = 1;
    float b = 3.4f;
    String c = "abcd";

    void hello() {
        System.out.println("Hello~~");
    }

    void hello2(String name) {
        System.out.println("hello " + name);
    }
    
    int add(int a, int b) {
        return a+ b;
    }
}








