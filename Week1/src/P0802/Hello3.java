/*
    23. 08. 01
        < 오늘 배운 것 >
         1. 메서드, 생성자 (초기화)
         2. 객체 배열
         3. 2차원 배열

        < 할일 >
         1. GitHub update 공부
         2. 이력서 쓰기
         3. --?
*/


package P0802;

import java.util.Scanner;

public class Hello3 {
    
    static int MAX_MEMBER_NUMBER = 100;
    
    /* ----------------------------------------------
        Q1) static ?????? 이건 뭘까? 자꾸 에러가 뜨넹,,,
        A) - 
    ---------------------------------------------- */
    
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);

        Member p1 = new Member("90honeypot", "abcd", "sangwook", "sangwook4.kim@gmail.com");
        p1.printMember();
        
        System.out.println();

        Member p2 = new Member("bupain", "qwer1234", "sungsu", "bupain@naver.com");
        p2.printMember();

        /* ----------------------------------------------
            1. 객체 배열 만들기
            2. 문자열 입력받고 split 하기 (python 방식과 동일)
            3. split 한 결과값은 String 배열에 넣어두고 사용
              - String[] str = sc.nextLine().split("\\s+");
                 \s - space
                `+` - Represents 1 or more
                `*` - Represents 0 or more
                `?` - Represents 0 or 1
            `{n,m}` - Represents n to m
        ---------------------------------------------- */
        Member[] members = new Member[MAX_MEMBER_NUMBER];
        for (int i = 0; i < MAX_MEMBER_NUMBER; i++) {
            System.out.println();
            String[] str = sc.nextLine().split(" +");
            members[i] = new Member(str[0],str[1],str[2],str[3]);
            members[i].printMember();
        }
        
        sc.close();
        
        System.out.println();
    }
}


class Member {
    
    String id;
    String password;
    String name;
    String email;

    /* ----------------------------------------------
        메서드(Method)
         - 기능구현
         - void : 반환값(return값) 없음

        
        생성자 : 함수탑이 없는 메서드. 이름은 클래스 이름과 동일.
        사용자가 안만들면 컴파일러가 기본 생성자 만들어줌. 아무 동작도 안하는 생성자 만들어줌
        생성자 역할 : 객체 초기화. 멤버변수 초기화

        메서드 오버로딩 (Method Overloading)
         - 같은 메서드에 파라미터만 다르게해서 여러개 만들 수 있다.
    ---------------------------------------------- */
    Member(){
        this.id = null;
        this.password = null;
        this.name = null;
        this.email = null;
    }
    Member(String id, String password, String name, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    void printMember() {
        System.out.printf("- ID : %s\n- PW : %s\n- NAME : %s\n- E-MAIL : %s\n", id, password, name, email);
    }

}
