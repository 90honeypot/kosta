package P0809;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        try {
            int x = 3 / 0;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("예외 발생");
        }
        System.out.println("프로그램 종료");
    }
}
