package P0810;

import java.util.HashMap;

public class Map2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "aaa");
        map.put("tel", "111");
        map.put("addr", "대한민국");
        System.out.println("name: " + map.get("name"));
        System.out.println("tel: " + map.get("tel"));
        System.out.println("addr: " + map.get("addr"));
        
        System.out.println(map.keySet());

        for(String key: map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        for(String val : map.values()) {
            System.out.println(val);
        }
    }
}
