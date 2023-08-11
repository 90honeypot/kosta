package Storage;
public class StorageDao {

    private Product[] prod;
    private int count;
    private static int code = 1;

    public StorageDao() {
        prod = new Product[10000];
        count = 0;
    }
    // 삭제(번호로 삭제, 출고할거 있으면 삭제불가)
    // 입고(제품 수량 늘림)
    // 출고(편의점에서 특정상품 주문하고 결제를 하면 주문개수만큼 수량 줄임, 출고처리결과 저장)

    // 상품등록 (제품명, 가격, 수량)
    public void register(Product p) {
        prod[count] = p;
        prod[count++].setCode(code++);
    }

    // 검색(번호로), idx로 제품 가져오기
    public Product getProductByIdx(int idx) {
        return prod[idx];
    }

    public int getIdxByCode(int code) {
        for (int i=0; i<count; i++) {
            if(prod[i].getCode() == code){
                return i;
            }
        }
        return -1;
    }

    public Product getProductByCode(int code) {
        Product item = new Product();
        for(int i=0; i<count; i++) {
            if(prod[i].getCode() == code) {
                item = prod[i];
                break;
            }
        }
        return item;
    }

    // 검색(제품명으로)
    public Product[] getProductsByName(String name) {
        Product[] items = new Product[count];
        int i, idx = 0;
        for (i = 0; i < count; i++) {
            if (prod[i].getName().equals(name)) {
                items[idx] = prod[i];
                idx++;
            }
        }
        return items;
    }
    

    // 수정(번호로 검색하여 가격수정) (완료, StorageService.java)
    // 삭제(번호로 삭제)
    // 출고할거 있으면 삭제불가 --> 이거 해야함...!!
    public void delete(int idx) {
        for (int i = idx; i < count - 1; i++) {
            prod[i] = prod[i + 1];
        }
        count --;
    }

    // 전체 리스트 출력
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(prod[i]);
        }
    }

    // 같은 제품명을 가진 리스트만 출력
    public void printByName(String name) {
        for (int i = 0; i < count; i++) {
            if(prod[i].getName().equals(name)) {
                System.out.println(prod[i]);
            }
        }
    }

    public int checkAllQuantityByName(String name) {
        Product[] p = getProductsByName(name);
        int all_quantity = 0;
        for (int i=0; i<count; i++) {
            if(p[i] == null) {
                break;
            }
            all_quantity += p[i].getQuantity();
        }
        return all_quantity;
    }

    // 출고


    public int getCount() {
        return this.count;
    }

}
