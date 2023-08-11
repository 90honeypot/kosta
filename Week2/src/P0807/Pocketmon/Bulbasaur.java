package P0807.Pocketmon;

public class Bulbasaur extends Pocketmon {
    public Bulbasaur() {
        name = "Bulbasaur";
        hp = 35;
        exp = 0;
        lv = 1;
    }

    @Override
    public void eat() {
        super.eat();
        hp += 6;
    }

    @Override
    public void sleep() {
        super.sleep();
        hp += 13;
    }

    @Override
    public boolean play() { // 생명 반환, true: 살았음, false: 죽음
        super.play();
        hp -= 10;
        exp += 7;
        lvCheck();
        return hp > 0;
    }

    @Override
    public boolean exc() {
        super.exc();
        hp -= 15;
        exp += 11;
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
    public void 넝클공격() {
        System.out.println("넝클공격~~~");
        
    }
}
