package P0807.Pocketmon;

import java.util.Scanner;

public class Game {
    private Pocketmon p;

    public void select(Scanner sc) {
        System.out.println("1.피카츄 2.파이리 3.이상해씨 4.종료");
        int n = sc.nextInt();
        sc.nextLine();
        switch (n) {
            case 2:
                p = new Charmander();
                break;
            case 3:
                p = new Bulbasaur();
                break;
            default:
                p = new Pikachu();
                break;
        }
        
    }

    public void run(Scanner sc) {
        boolean flag = true;
        int n = 0;
        while(flag) {
            System.out.println("1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.상태확인 6.특기공격 7.종료");
            n = sc.nextInt();
            sc.nextLine();
            switch(n) {
                case 1:
                    p.eat();
                    break;
                case 2:
                    p.sleep();
                    break;
                case 3:
                    flag = p.play();
                    break;
                case 4:
                    flag = p.exc();
                    break;
                case 5:
                    p.printStatus();
                    break;
                case 6: // 특기공격
                    if(p instanceof Pikachu) {
                        ((Pikachu)p).백만볼트();
                    } else if(p instanceof Charmander) {
                        ((Charmander)p).불지르기();
                    } else if(p instanceof Bulbasaur) {
                        ((Bulbasaur)p).넝클공격();
                    }
                    break;
                case 7:
                    flag = false;
                    break;
            }
        }

    }
}