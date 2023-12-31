


public class NOTE {

    /*
        # 상속
        1. 코드 재사용성 높임
            : 비슷한 객체들이 도출 => 공통부분 추출 => 부모 클래스로 정의 => 공통점을 갖는 클래스들을 자식 클래스로 정의
        2. 다형성 구현 (객체 지향의 꽃)
        3. 컴포넌트 베이스 개발 (인터페이스 기반 개발)

        예시) 학사관리
        - 학생 : 번호, 이름, 학과, 수강과목
        - 교직원 : 번호, 이름, 부서, 직무
        - 교수 : 번호, 이름, 학과, 개설과목

        부모 클래스 (학생, 교직원, 교수 공통점을 정의)
        class Person {
            String id_num;
            String name;
            String dept;
        }

        # 상속관계, "is a" 관계로 태어나자마자 상속받은 형질을 갖음.s
        class Student extends Person {
            String[] courses;
        }

        # 포함관계, "has a" 관계로 다른 클래스 객체를 멤버변수로 정의.
        class Student {
            Person p;
            String[] courses;
        }

        # 상속의 특징
        1. 부모 클래스의 멤버변수와 메서드를 받는다.
        2. private 멤버와 생성자는 물려받지 않는다.
        3. 상속 관계의 하위 클래스 객체를 생성하면 상위에 있는 모든 클래스 객체 생성됨
        4. 다중 상속은 불가. extends 뒤에 클래스는 1개만 올 수 있다.

        
        # 메서드 오버 라이딩
        1. 상속 받은 메서드 수정해서 사용.
        2. 메서드 프로토 타입은 수정불가. 메서드 구현 내용만 변경
        3. 재정의 된 메서드는 앞 객체 타입에 정의된 것으로 실행
        4. 재정의 이전 메서드를 사용하려면 super.메서드()로 호출가능
        
        # super
        부모세대의 메서드 호출할때 사용

        # 업캐스팅
        - 메모리는 자식인데 타입이 부모
        - 타입이 부모라서 부모 노릇함 (부모 클래스에 정의된 멤버변수 / 메서드만 사용가능)
        - 재정의된 메서드 호출시 자식 메서드가 호출됨
        - 캐스팅 연산자 없이 자동처리
        
        # 다운캐스팅
        - 업캐스팅된 타입을 원래대로 내리는 캐스팅
        - 캐스팅 연산자로 내릴 타입 지정
        - 하위 클래스에 추가된 멤버를 사용할 때 다운 캐스팅을 한다.
        
        # 타입비교
        A instanceof B: A,B 타입비교해서 같으면 true, 다르면 false
        

        # 복습
        vo : 객체 값 저장
        dao : 
        service
        controller

        # 추상클래스
        - 추상 메서드를 하나 이상 포함한 클래스
        - 추상 메서드 : 구현 없이 선언문만 작성한 메서드
        - 완성된 클래스가 아니기 때문에 객체를 생성할 수 없다.
         : 상속을 목적으로하는 ...!
        - 메서드의 틀만 잡을테니 상속받는 하위 클래스에서 적합하게 재정의해서 쓰라는 의미
        - 추상 클래스는 구현된 메서드 포함 가능. 추상 메서드가 하나라도 있으면 됨
         ex)
         public abstract void eat();

        추상클래스는 상속을 목적으로 하고, 객체 생성 안할거다
        그렇기 때문에 하위 클래스에 상속해줄 메서드를 선언 => 아웃라인 잡아줌
        상속받은 추상메서드들을 하위 클래스에 적합하게 구현하여 사용
        상속해준 모든 추상 메서드는 구현해야함

        # final --> 변경불가
        - 변수: public final static int MAX = 100; ==> 상수
        - 메서드: 재정의 불가
        - 클래스: 상속 불가

        # 인터페이스
        완전추상클래스
        상수와 추상메서드로만 구성된 클래스
        인터페이서 정의 시 사용 키워드로 class대신 interface사용
        객체를 만들 수 없다 => 상속받아서 모든 추상메서드 구현시 하위클래스로 객체생성가능
        먼소릴까?
        

    */
    
}
