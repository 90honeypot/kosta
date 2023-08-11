package P0802;

import java.util.Scanner;
public class PikachuGame {

    static void printMenu() {
        System.out.println("---------- 메뉴 -------------");
        System.out.println("1. 밥먹기\n2. 잠자기\n3. 운동하기\n4. 놀기\n5. 게임종료");
    }

    public static void main(String[] args) {

        Pikachu pika;
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("----- 피카츄 게임 시작 ----------");
        System.out.println("---------------------------------\n");

        System.out.println("---------------------------------");
        System.out.println("1. 피카쥬 이름 짓기 (싫으면 0 입력)");
        System.out.println("---------------------------------\n");
        String name = sc.nextLine();
        if (name.equals("0")) {
            pika = new Pikachu();
        } else {
            pika = new Pikachu(name);
        }
        System.out.println("\n## 피카츄 이름 : " + pika.name + "\n");
        
        printMenu();
        
        System.out.print("--------------------------\n>> 뭐할래? : ");
        int menu = sc.nextInt();
        System.out.println();
        int status;
        while(menu != 5) {
            switch(menu) {
                case 1:
                    System.out.println("피카츄가 밥을 먹었습니다.");
                    pika.eating();
                    break;
                
                case 2:
                    System.out.println("피카츄가 잠을 잤습니다.");
                    pika.sleeping();
                    break;
                
                case 3:
                    System.out.println("피카츄가 운동을 하였습니다.");
                    status = pika.exercising();
                    if (status == 1) {
                        System.out.println("피카츄가 체력이 0이 되어 사망하였습니다.\n");
                        return;
                    } else if (status == 2) {
                        System.out.println("피카츄가 렙업하였습니다.");
                    }
                    break;
                
                case 4:
                    System.out.println("피카츄가 놀았습니다.");
                    status = pika.playing();
                    if (status == 1) {
                        System.out.println("피카츄가 체력이 0이 되어 사망하였습니다.\n");
                        return;
                    } else if (status == 2) {
                        System.out.println("피카츄가 렙업하였습니다.");
                    }
                    break;

                default:
                    System.out.println("번호를 다시 입력해주세요.");
                    printMenu();
            }
            pika.printStatus();
            
            printMenu();
            System.out.print("-------------------------\n>> 또 뭐할래? : ");
            menu = sc.nextInt();
            System.out.println();

        }
        System.out.println("\n게임을 종료합니다.\n");

        sc.close();

    }


}

class Pikachu {
    String name;
    int hp = 30;
    int exp = 0, MAX_EXP = 20;
    int lv = 1;
    
    Pikachu() {
        this.name = "pika";
    }
    Pikachu(String name) {
        this.name = name;
    }
    
    void lvCheck() {
        
    }

    void eating() { hp += 5; }

    void sleeping() { hp += 10; }

    int playing() {
        int ret = 0;
        hp -= 5;
        exp += 4;
        if (hp <= 0) { ret = 1; }
        else if (exp >= MAX_EXP) {
            lv += 1;
            exp -= MAX_EXP;
            ret = 2;
        }
        return ret;
    }

    int exercising() {
        int ret = 0;
        hp -= 9;
        exp += 10;
        if (hp <= 0) { ret = 1; }
        else if (exp >= MAX_EXP) {
            lv += 1;
            exp -= MAX_EXP;
            ret = 2;
        }
        return ret;
    }

    void printStatus() {
        System.out.printf("\n피카츄(%s) 레벨 : %d\n체력 : %d\n경험치 : %d/%d\n\n", name, lv, hp, exp, MAX_EXP);
    }

}