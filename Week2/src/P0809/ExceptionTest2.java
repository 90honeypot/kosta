package P0809;

public class ExceptionTest2 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        Object obj = null;
        int x = 5;
        try {
            System.out.println("-1");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("-2");
            int hashcode = obj.hashCode();
            System.out.println("-3");
            int res = x / 0;
            
        } catch (ArithmeticException e) {
            System.out.println("-5");
            System.out.println(">" + e + "\n");
            e.printStackTrace();
            System.out.println(">>" + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("-6");
            System.out.println(e);
            
        } catch (NullPointerException e) {
            System.out.println("-7");
            System.out.println(e);
        } finally {
            System.out.println("무조건 실행");
        }
    }
}
