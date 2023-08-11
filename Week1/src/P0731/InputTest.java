package P0731;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        String c = sc.next();
        
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("c: "+ c);
        
        */
        
        /*
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        int score = num;

        if (score > 100 || score < 0) {
            System.out.println("범위 밖");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        System.out.println("");

        // switch
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
        */
        /*
        int dan = sc.nextInt();

        System.out.println(dan + "단 출력.");
        for (int i=1; i<10; i++) {
            // System.out.println(dan + " X " + i + " = " + dan*i);
            System.out.printf("%d X %d = %d\n", dan, i, dan*i);
        }
        */
        
        /*
        for (int i=1; i<100; i++) {
            if (i%2 == 1) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println("");
        */
        /*
        int num = sc.nextInt();
        
        System.out.printf("%d 의 약수는\n", num);
        for (int i=1; i<=num; i++) {
            if(num % i == 0) {
                System.out.printf("%d ", i);
            }
        }
        
        System.out.println("\n");
        */

        /*
        for(int i=1; i<10; i++) {
            for (int j=2; j<10; j++) {
                System.out.printf("%d X %d = %2d\t", j, i, j*i);
            }
            System.out.println();
        }
        System.out.println();
        */

        
        int menu = 0;
        int hp = 30, exp = 0, lv=1;
        int MAX_HP = 20, MAX_EXP = 50;

        boolean game = true;

        while (game) {
            if (menu == 5) {
                break;
            }

            System.out.println("<메뉴>\n1.밥먹기\t2. 잠자기\t3. 운동하기\t4. 놀기\t5. 종료");
            
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    hp += 5;
                    if (hp > MAX_HP) {
                        hp = MAX_HP;
                        System.out.printf("밥을 먹고 피카츄가 좋아합니다. HP가 가득찼습니다. (HP: %d/%d, EXP: %d/%d, LV: %d)", hp, MAX_HP, exp, MAX_EXP, lv);
                    } else {
                        System.out.printf("밥을 먹고 피카츄가 좋아합니다. HP가 5만큼 증가하였습니다. (HP: %d/%d, EXP: %d/%d, LV: %d)", hp, MAX_HP, exp, MAX_EXP, lv);
                    }
                    break;

                case 2:
                    hp += 10;
                    if (hp > MAX_HP) {
                        hp = MAX_HP;
                        System.out.printf("잠을 자고 피카츄가 개운해합니다. HP가 가득찼습니다. (HP: %d/%d, EXP: %d/%d, LV: %d)", hp, MAX_HP, exp, MAX_EXP, lv);
                    } else {
                        System.out.printf("잠을 자고 피카츄가 개운해합니다. HP가 10만큼 증가하였습니다. (HP: %d/%d, EXP: %d/%d, LV: %d)", hp, MAX_HP, exp, MAX_EXP, lv);
                    }
                    break;

                case 3:
                    hp -= 4;
                    exp += 3;
                    
                    if (hp <= 0) {
                        System.out.println("피카츄의 HP가 0이되어 사망하였습니다. R.I.P");
                        game = false;
                        break;
                    } else {
                        if (exp < MAX_EXP) {
                            System.out.printf("피카츄가 열심히 뛰어놀았습니다. HP가 4만큼 감소하였습니다. EXP가 3 증가하였습니다. (HP: %d/%d, EXP: %d/%d, LV: %d)", hp, MAX_HP, exp, MAX_EXP, lv);
                        } else {
                            exp -= MAX_EXP;
                            lv += 1;
                            System.out.printf("피카츄가 열심히 뛰놀아서 레벨업을 하였습니다!! 현재 레벨은 Lv %d 입니다. (HP: %d/%d, EXP: %d/%d, LV: %d)", hp, MAX_HP, exp, MAX_EXP, lv);
                        }
                    }
                    break;
                
                case 4:
                    hp -= 8;
                    exp += 8;
                    if (hp <= 0) {
                        System.out.println("피카츄의 HP가 0이되어 사망하였습니다. R.I.P");
                        game = false;
                        break;
                    } else {
                        if (exp < MAX_EXP) {
                            System.out.printf("피카츄가 열심히 운동하였습니다. HP가 8만큼 감소하였습니다. EXP가 8 증가하였습니다. (HP: %d/%d, EXP: %d/%d, LV: %d)\n", hp, MAX_HP, exp, MAX_EXP, lv);
                        } else {
                            exp -= MAX_EXP;
                            lv += 1;
                            System.out.printf("피카츄가 열심히 운동해서 레벨업을 하였습니다!! 현재 레벨은 Lv %d 입니다. (HP: %d/%d, EXP: %d/%d, LV: %d)", lv, hp, MAX_HP, exp, MAX_EXP, lv);
                        }
                    }
                    break;

                case 5:
                    System.out.println("게임을 종료하였습니다. 수고링");
                    game = false;
                    break;

                default:
                    System.out.println("메뉴 번호를 제대로 입력하여 주십시오.");
            }
            System.out.println("\n");

        }

        sc.close();
        
    }

}
