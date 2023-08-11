package P0810;

import java.util.ArrayList;

class Test {
    int x = 12;
    int y = 34;

    @Override
    public String toString() {
        return "{" +
                " x='" + x + "'" +
                ", y='" + y + "'" +
                " }";
    }
}

public class ListTest1 {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();
        arr.add("asdf");
        arr.add(12);
        arr.add(34.5f);
        arr.add(new Test());

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println(arr.contains(12));
        System.out.println(arr.contains(13));

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add(0, "bbb");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        list.set(1, "ccc");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        if(list.contains("bbb")) {
            int idx = list.indexOf("bbb");
            System.out.println(idx + " 방에 있음");
        } else {
            System.out.println("없음");
        }

        if(list.isEmpty()) {
            System.out.println("비었음");
        } else {
            System.out.println("데이터 있음");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove("bbb");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove("bbb");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.clear();


    }
}
