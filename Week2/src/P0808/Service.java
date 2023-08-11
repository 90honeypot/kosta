package P0808;

public class Service {
    private Dao dao; // interface 타입으로 선언.

    /* 의존성 주입, 생성자 또는 setter로 가능 */
    public Service(Dao dao) {
        this.dao = dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public void add() {
        System.out.println("추가기능");
        dao.insert();
    }

    public void get() {
        System.out.println("검색기능");
        dao.select();
    }

    public void edit() {
        System.out.println("수정기능");
        dao.update();
    }

    public void del() {
        System.out.println("삭제기능");
        dao.delete();
    }
}
