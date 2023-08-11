package P0807.Pocketmon;
public class Charmander extends Pocketmon {
    public Charmander() {
        name = "Charmander";
        hp = 25;
        exp = 0;
        lv = 1;
    }

    @Override
    public void eat() {
        super.eat();
        hp += 4;
    }

    @Override
    public void sleep() {
        super.sleep();
        hp += 9;
    }

    @Override
    public boolean play() { // 생명 반환, true: 살았음, false: 죽음
        super.play();
        hp -= 7;
        exp += 3;
        lvCheck();
        return hp > 0;
    }

    @Override
    public boolean exc() {
        super.exc();
        hp -= 12;
        exp += 10;
        lvCheck();
        return hp > 0;
    }

    @Override
    public void lvCheck() {
        super.lvCheck();
        if (hp <= 0) {
            return;
        }
        if (exp >= 20) {
            lv++;
            exp -= 20;
            System.out.println(name + "의 lv 이 1 올랐습니다.");
        }
    }
    public void 불지르기() {
        System.out.println("불질러~~~~");
        
    }
}
