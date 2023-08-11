package P0808;

class Car {
    String name;

    public void horn() {
        System.out.println("경적소리");
    }
}

class 소방차 extends Car {
    public 소방차() {
        name = "소방차";
    }

    @Override
    public void horn() {
        super.horn();
        System.out.println("빠아아아아앙");
    }
    public void 구조() {
        System.out.println("구조");
    }
}

class 구급차 extends Car {
    public 구급차() {
        name = "구급차";
    }

    @Override
    public void horn() {
        super.horn();
        System.out.println("에~~~~~엥");
    }
    public void 구급() {
        System.out.println("구급");
        
    }
}

class 경찰차 extends Car {
    public 경찰차() {
        name = "경찰차";
    }

    @Override
    public void horn() {
        super.horn();
        System.out.println("삐 뽀 삐 뽀");
    }
    public void 체포() {
        System.out.println("체포");
    }
}

class Handler {
    public void action(Car car) {
        System.out.println("name: " + car.name);
        
        car.horn();
    }
}

public class CarTest {
    public static void main(String[] args) {
        /* 다형성 1번 예시 */
        System.out.println("------------------------");
        Car c1 = new 경찰차();
        c1.horn();
        c1 = new 소방차();
        c1.horn();
        c1 = new 구급차();
        c1.horn();

        /* 다형성 2번 예시 - 메서드의 파라미터로 업캐스팅*/
        System.out.println("------------------------");
        Handler h = new Handler();
        h.action(new 경찰차());
        h.action(new 소방차());
        h.action(new 구급차());
        
        /* 다형성 3번 예시 - 배열타입을 부모타입으로 생성하면 다양한 자식 객체 저장 가능`*/
        System.out.println("------------------------");
        Car[] arr = {new Car(), new 경찰차(), new 소방차(), new 구급차()};
        for(int i=0; i<arr.length; i++) {
            arr[i].horn();
            // 추가된 메서드
            if(arr[i] instanceof 경찰차) {
                ((경찰차)arr[i]).체포();
            }
            else if(arr[i] instanceof 소방차) {
                ((소방차)arr[i]).구조();
            }
            else if(arr[i] instanceof 구급차) {
                ((구급차)arr[i]).구급();
            }
            System.out.println();
        }
    }

}
