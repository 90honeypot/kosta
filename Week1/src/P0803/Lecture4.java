package P0803;

import P0803.test.Person;

/*

    메서드 : 객체의 기능구현

    객체 지향 프로그래밍
    클래스 : 멤버변수, 메드
    멤버변수 타입 제약 없음
    
    <객체 지향 프로그래밍 기법>
    1. 메서드 오버로딩 Method Overloaing (Ex1)
        - 동일한 이름의 메서드를 여러개 만들 수 있는 특징 (ex. 생성자 매개변수 다르게 여러개 만드는 것)
        - 매개변수 타입이나 개수만 다르면 가능.
    2. 생성자
        - 클래스와 동일한 이름의 메서드. 리턴타입이 없다.
        - 원할 때 호출불가. 객체 생성시 호출됨
        - 멤버변수(객체) 초기화
        - 오버로딩이 가능함
        - 매개변수를 받는 생성자 메소드를 만들면, 매개변수 안받는건 따로 생성되지 않음.
    3. this
        - 현재 객체의 참조값을 갖는 참조변수
    4. static (Ex2, Ex3)
        1) static 멤버변수
            int a;          -> 일반 멤버변수 : heap 에 저장, 객체가 생성될때 할당 (new)
            static int b;   -> static 멤버변수 : static 에 저장, 프로그램 실행되자마자 할당
                                               객체 생성 유무와 상관X
                                               초기화는 1번만 실행
            - static에 따로 한개만 만들고 클래스로 만든 모든 객체들이 공용으로 사용
            - 객체 소속이 아니고 클래스 소속이므로, 호출할때 클래스.변수 / 클래스.메서드 로 사용
            - 초기화 블록 앞에도 static 이 붙음
        2) static 메서드
            - 일반 메서드는 일반멤버변수와 static변수 모두 가능.
            - 일반 메서드는 객체를 생성해야 사용가능 -> 객체 생성 후에는 일반멤버변수와 static 변수 모두 생성
            - static 메서드에서는 일반 멤버변수는 사용할 수 없다.
                Why? 일반 멤버변수는 객체 생성전에 호출이 불가하기 때문
                마찬가지로 static메서드안에서 일반 메서드도 호출이 불가하다.
            QQQQ) 그럼 static 함수는 언제 사용하는게 좋을까?
             ^^;
    5. 패키지 (Ex5, P0803.test 패키지)
        - 클래스 묶음.
        - 관리 편이성, 접근 제한
    6. 접근 제어자
        - 클래스, 멤버변수, 메서드에 붙이는 지시자.
        - 어느 범위까지 사용할 수 있게 할지 결정 (보호역할)
        - 종류
            1) 클래스 : public(모든곳에서 사용가능), default(같은 패키지에서만 사용가능)
            2) 멤버변수/ 메서드
                - private : 클래스 내에서만 보임, 은닉성 (데이터를 보호하기위함)
                - default : 같은 패키지 내에서는 모두 보임
                - protected : 같은 패키지에서는 상속 관계없이 모두에 보임
                              다른 패키지에서는 상속 관계의 클래스에서만 보임
                - public : 같은패키지, 다른패키지 모두에 오픈
            * 일반적으로 생성자는 public으로 만들어줌 (어디서나 생성할 수 있게..!)

    ** 파일 하나에 class 하나가 가장 이상적임 (모두 public class)

    ********** 세상에서 가장 중요함 **********
    # vo (value object) : 값 저장 객체. 객체 한개 정보를 담는 클래스
    # dao (database access object) : DB 작업하는 클래스
    # service : 비즈니스 로직 제공. 외부에 기능 제공
    # controller : 요청 처리
    # main

    ex) 주소록 만들기
    # VO
        - Member(name, tel, address)

    # DAO
        - Member[] 배열 생성
        - 추가, 검색, 수정, 삭제 ...
        - 배열처리만 구현.
    
    # service
        - 사용자 입력받아서 각 기능 구현
    
    # controller
        - 메뉴 돌림

    # main

    

*/



public class Lecture4 {

    public static void main(String[] args) {
        // ------ Ex1 ------
        {
            Add a = new Add();
            System.out.println(a.add(1,2));
            System.out.println(a.add(1,2,3));
            System.out.println(a.add("AAA","BBB"));
        }
        
        // ------ Ex2 ------
        {
            Test2 t1 = new Test2();
            t1.a++;
            Test2.b++;
            t1.print();
            Test2 t2 = new Test2();
            t2.a++;
            Test2.b++;
            t2.print();
            Test2 t3 = new Test2();
            t3.a++;
            Test2.b++;
            t3.print();
        }
        
        // ------ Ex4 ------
        {
            System.out.println("pi: " + Math.PI);
            System.out.println("abs(-10): " + Math.abs(-10));
            System.out.println("floor(3.4): " + Math.floor(3.4));   // 반올림
            System.out.println("ceil(3.4): " + Math.ceil(3.4));     // 올림
        }
            
        // ------ Ex5 ------
        {
            Person p1 = new Person();
            p1.name = "상욱";
            p1.age = 33;
            // Person2 p2 = new Person2();
        }
    }
    
}

// Ex1.
class Add {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    String add(String a, String b) {
        return a + b;
    }
}
// Ex2.
class Test2 {
    int a;
    static int b;
    static int count;
    {
        a = 10;
    }
    static {
        b = 20;
        count = 0;
    }
    // 생성자ㅌ
    Test2 () {
        count ++;
        printCount();
    }

    void printCount() {
        System.out.println(count + "번째 객체가 생성되었습니다.");
    }
    void print() {
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}

// Ex3.
class Test3 {
    int a = 10;
    static int b = 30;

    void method1() {
        a = 1;
        b = 2;
    }
    static void method2() {
        // a = 1;
        b = 2;
    }
    void method3() {
        method1();
        method2();
    }
    static void method4() {
        // method1();
        method2();
    }
}
