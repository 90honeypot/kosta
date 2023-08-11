package P0809;

public class StringTest {
    public static void main(String[] args) {
        // String 생성
        String str1 = "asdf";
        String str2 = new String("asdf");
        String str3 = new String(str1);
        char[] str4 = {'a','s','d','f'};
        String str5 = new String(str4);
        String str6 = "asdf";

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
        System.out.println("str4 : " + str4);
        System.out.println("str5 : " + str5);

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println("str1 == str6 : " + (str1 == str6));

        str1 += 123;
        System.out.println("str1 + 123 : " + str1);
        str2 = 123 + str2;
        System.out.println("123 + str2 : " + str2);
    }
}
