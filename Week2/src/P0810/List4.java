package P0810;

import java.util.Iterator;
import java.util.Vector;


public class List4 {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("ABC");
        list.add("EFG");
        list.add("HIF");
        
        // 이터레이터 : 반복자. 리스트에서 요소를 하나씩 꺼내는 것을 반복
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) { // hasNext():다음요소 있으면 true, 없으면 false
            System.out.println(iter.next()); // next(): 요소 하나 리턴
        }

        // 내부 반복자사용
        for(String v: list) {
            System.out.println(v);
        }
    }
}
