package P0808;
abstract class Pocketmon2 {
    protected int hp;
    protected int exp;
    protected int lv;
    protected String name;

    public abstract void eat();
    public abstract void sleep();
    public abstract boolean play();
    public abstract boolean exc();
    public abstract void lvCheck();
    
    public void printStatus() {
        System.out.println(name + " 상태확인");
        System.out.println("hp: " + hp);
        System.out.println("exp: " + exp);
        System.out.println("lv: " + lv);
    }
    
}

class Pocketmon2Impl extends Pocketmon2 {

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("밥먹음");
        return;
    }

    @Override
    public void sleep() {
        System.out.println("잠");
    }

    @Override
    public boolean play() {
        System.out.println("놈");
        return true;
    }

    @Override
    public boolean exc() {
        System.out.println("운동함");
        return true;
    }

    @Override
    public void lvCheck() {
        System.out.println("레벨체크");
    }

}

public class AbstractTest {
    public static void main(String[] args) {
        Pocketmon2Impl p = new Pocketmon2Impl();
        p.eat();
        p.sleep();
        p.play();
        p.exc();
        p.lvCheck();
        p.printStatus();        
    }
}
