package P0809;

public class StringTest2 {
    public static void main(String[] args) {
        String str1 = "abcdefdeghi";
        String str2 = "123";

        System.out.println("str1.charAt(3) : " + str1.charAt(3));
        System.out.println("str1.concat(str2) : " + str1.concat(str2));
        System.out.println("str1.contains(\"de\") : " + str1.contains("de"));
        System.out.println("str1.indexOf(\"de\") : " + str1.indexOf("de"));
        System.out.println("str1.lastIndexOf(\"de\") : " + str1.lastIndexOf("de"));
        System.out.println("str1.startsWith(\"ab\") : " + str1.startsWith("ab"));
        System.out.println("str1.endsWith(\"ghi\") : " + str1.endsWith("ghi"));
        System.out.println("str1.replace(\"abc\", \"xyz\") : " + str1.replace("abc", "xyz"));

        String str3 = "123,456,789";
        String[] sp = str3.split(",");
        for (String s: sp) {
            System.out.println(s);
        }
    }
}
