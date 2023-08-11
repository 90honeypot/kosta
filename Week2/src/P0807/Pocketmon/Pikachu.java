package P0807.Pocketmon;

public class Pikachu extends Pocketmon {
    public Pikachu() {
        name = "Pikachu";
        hp = 30;
        exp = 0;
        lv = 1;
    }

    @Override
    public void eat() {
        super.eat();
        hp += 5;
    }

    @Override
    public void sleep() {
        super.sleep();
        hp += 10;
    }

    @Override
    public boolean play() { // 생명 반환, true: 살았음, false: 죽음
        super.play();
        hp -= 8;
        exp += 4;
        lvCheck();
        return hp > 0;
    }

    @Override
    public boolean exc() {
        super.exc();
        hp -= 15;
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

    public void 백만볼트() {
        System.out.println("백만볼트공격~~~");
        
    }
}
