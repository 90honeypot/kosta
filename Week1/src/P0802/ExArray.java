package P0802;

public class ExArray {
    /*
        2차원배열
        행 수만 미리 정해주고
        각 행마다 요소의 갯수는 다르게 할 수 있다.
    */

    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[] { 1, 2 };
        a[1] = new int[] { 3, 4, 5 };
        a[2] = new int[] { 11 };
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
        /*
            배열의 복사
             1. 얕은 복사 : 참조값만 복사, 메모리 하나에 이름이 2개인 상태. 값을 바꾸면 서로 영향
             2. 깊은 복사는? System.arraycopy(원본배열, 원본배열 시작idx, 타겟배열, 타겟배열 시작idx, 복사할배열의 길이)
        */

        int[] temp1 = {1,2,3,4,5};
        
        // 1. 얕은 복사
        int[] temp2 = temp1;
        
        // 2. 깊은 복사
        temp2 = new int[temp1.length];
        System.arraycopy(temp1, 0, temp2, 0, temp1.length);
        temp2[3] = 1000;

        for (i = 0; i < temp1.length; i++) {
            System.out.printf("%d ", temp1[i]);
        }
        System.out.println();

        for (i = 0; i < temp2.length; i++) {
            System.out.printf("%d ", temp2[i]);
        }
        System.out.println();

        int[] temp3 = {11, 12, 13, 14, 15, 16, 17};
        System.arraycopy(temp1, 1, temp3, 2, 3);
        for (i = 0; i < temp3.length; i++) {
            System.out.printf("%d ", temp3[i]);
        }
        System.out.println();


    }
}
