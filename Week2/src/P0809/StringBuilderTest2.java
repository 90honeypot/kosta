package P0809;

public class StringBuilderTest2 {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        System.out.println(sb.toString());

        sb.insert(1, "kkk");
        System.out.println(sb.toString());
        
        sb.replace(1, 5, "ttt");
        System.out.println(sb.toString());
        
        sb.delete(1, 3);
        System.out.println(sb.toString());

        System.out.println(sb.substring(1,5).toString());
        
    }
}
