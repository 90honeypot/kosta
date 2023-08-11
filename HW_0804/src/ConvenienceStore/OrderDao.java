package ConvenienceStore;
/*
    private static int code = 1;    // 주문번호 (자동할당)
    private int product_code;   // 주문한 상품번호
    private int quantity;       // 주문수량
    private int price;          // 결제가격
    private boolean paid;       // 결제유무
    private boolean released;   // 출고여부
*/

public class OrderDao {
    
    private Order[] order;
    private int count;
    private static int code;
    public OrderDao() {
        order = new Order[1000000];
        count = 0;
        code = 1;
    }

    public Order[] getOrder() {
        return this.order;
    }
    public void setOrder(Order[] order) {
        this.order = order;
    }
    public int getCount() {
        return this.count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    
    // 주문추가
    // 상품명, 수량으로 주문받고
    // 결제가격 입력 후,
    // Order객체 리턴
    public void add(Order o) {
        order[count] = o;
        order[count++].setCode(code++);
    }

    // 내 주문목록
    public void allList() {
        for(int i=0; i<count; i++) {
            System.out.println(order[i]);
        }
    }
    
    // code (주문번호) 값으로 전체 object가져오기 없으면 null
    public Order getObjectByCode(int code) {
        for(int i=0; i<count; i++) {
            if(order[i].getCode() == code) {
                return order[i];
            }
        }
        return null;
    }
    // code (주문번호) 값으로 idx가져오기 없으면 null
    public int getIdxByCode(int code) {
        for(int i=0; i<count; i++) {
            if(order[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }
    
    public Order getOrderByIdx(int idx) {
        return order[idx];
    }
    
    
    // 주문취소 (결제안한것만)
    // 주문 리스트에서 삭제
    public void cancel(int idx) {
        for(int i=idx; i<count-1; i++) {
            order[i] = order[i+1];
        }
        count--;
    }
    
    // 출고현황
    public void releaseList(boolean flag) {
        for(int i=0; i<count; i++) {
            if(order[i].isReleased() == flag) {
                System.out.println(order[i]);
            }
        }
    }
    public void paidList(boolean flag) {
        for(int i=0; i<count; i++) {
            if(order[i].isPaid() == flag) {
                System.out.println(order[i]);
            }
        }
    }


}
