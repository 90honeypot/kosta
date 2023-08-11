package P0803;

/*
    private 멤버는 읽기 메서드(getter), 쓰기 메서드(setter) 제공 필요.
    1. 쓰기 메서드 (setter)
        : 파라미터로 값을 쓸 멤버변수와 동일한 타입값 하나를 받아서 멤버 변수에 할당
        : 리턴타입은 항상 void, 이름은 set + 멤버변수이름
    2. 읽기 메서드 (getter)
        : private 멤버변수를 return. 클래스 밖에서 이 값을 받아 읽을 수 있음
    
*/

public class PrivateTest {
    
    public static void main(String[] args) {
        Test5 t = new Test5();
        t.setName("상욱");
        t.setAge(23);
        System.out.println(t.toString());
    }
}
    
class Test5 {
    
    private int age;
    private String name;
    
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    


}


