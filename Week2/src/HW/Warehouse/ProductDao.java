package HW.Warehouse;

// 배열에 저장, 검색, 삭제 ...
public class ProductDao {
    private Product[] prods;
    private int cnt;

    public ProductDao() {
        prods = new Product[50];
        cnt = 0;
    }

    public boolean insert(Product p) {
        if (cnt >= prods.length) {
            return false;
        }
        prods[cnt++] = p;
        return true;
    }

    public int select(int num) {
        for (int i = 0; i < cnt; i++) {
            if (num == prods[i].getNum()) {
                return i;
            }
        }
        return -1;
    }

    public void delete(int num) {
        for (int i = num; i < cnt - 1; i++) {
            prods[i] = prods[i + 1];
        }
        cnt--;
    }

    public Product getProductByIdx(int idx) {
        return prods[idx];
    }

    public void selectAll() {
        for (int i = 0; i < cnt; i++) {
            System.err.println(prods[i]);
        }
    }
}
