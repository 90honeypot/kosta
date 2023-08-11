package P0808;

public class DaoImplMysql implements Dao{

    @Override
    public void insert() {
        System.out.println("MySQL insert");
    }
    
    @Override
    public void select() {
        System.out.println("MySQL select");
    }
    
    @Override
    public void update() {
        System.out.println("MySQL update");
    }
    
    @Override
    public void delete() {
        System.out.println("MySQL delete");
    }
    
}
