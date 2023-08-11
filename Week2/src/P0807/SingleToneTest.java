package P0807;

import java.util.Calendar;

class SingleTone {
    private int num;
    private String data;
    
    /* 클래스 안에서 객체를 static으로 생성해서 공용으로 사용하는 방법: 싱글톤 */
    private static SingleTone st = new SingleTone();
    
    /* private 생성자 : 클래스 밖에서 객체 생성 불가 */
    private SingleTone() {}
    
    /* 싱글톤 객체를 외부에서 받을 수 있게 static형 getInstance() 생성 */
    public static SingleTone getInstance() {
        return st;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
            " num='" + getNum() + "'" +
            ", data='" + getData() + "'" +
            " }";
    }


}

public class SingleToneTest {
    public static void main(String[] args) {
        
        // SingleTone s = new SingleToneTest();
        SingleTone s = SingleTone.getInstance();
        s.setData("abc");
        s.setNum(10);
        System.out.println(s);

        Calendar c = Calendar.getInstance(); // SingleTone 임
        System.out.println(c.getTime());
    }
}