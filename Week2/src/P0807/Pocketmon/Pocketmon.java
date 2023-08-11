package P0807.Pocketmon;

public class Pocketmon {

    protected int hp;
    protected int exp;
    protected int lv;
    protected String name;

    public void eat() {
        System.out.println(name + " 밥먹는다");
    }

    public void sleep() {
        System.out.println(name + " 잔다");
    }

    public boolean play() {
        System.out.println(name + " 논다");
        return true;
    }

    public boolean exc() {
        System.out.println(name + " 운동한다");
        return true;
    }

    public void lvCheck() {
        System.out.println(name + " 레벨 체크");
    }

    public void printStatus() {
        System.out.println(name + " 상태확인");
        System.out.println(" hp: " + hp);
        System.out.println(" exp: " + exp);
        System.out.println(" lv: " + lv);
    }

    public int getHp(){
        return this.hp;
    }

}
