package P0809;

class Num {
    private int num;

    public void setNum(int num) throws MyException {
        if (num < 5) {
            // 예외 객체
            throw new MyException("숫자는 5 이상만!");
        } else {
            this.num = num;
        }
    }

    public int getNum() {
        return num;
    }
}

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class ThrowTest {
    public static void main(String[] args) {
        Num n = new Num();
        try {
            n.setNum(8);
            System.out.println("num: " + n.getNum());
            n.setNum(3);
            System.out.println("num: " + n.getNum());

        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("stop");
    }
}
