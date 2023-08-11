package P0808;

public class DaoMain {
    public static void main(String[] args) {
        Service service = new Service(new DaoImplOracle());
        service.add();
        service.get();
        service.edit();
        service.del();
    }
}
