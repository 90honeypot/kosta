package P0810.AddressBook;

public class Member {
    private int code;
    private String name;
    private String tel;
    private String addr;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) { // 비교 대상 객체 타입이 동일한가 확인
            Member m = (Member) obj; // obj를 Member 타입으로 다운 캐스팅
            if (m.name.equals(name)) { // 이름이 같으면 같은 객체
                return true;
            }
        }
        return false;
    }

    public Member() {
    }

    public Member(int code, String name, String tel, String addr) {
        this.code = code;
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "{" +
                " code='" + getCode() + "'" +
                ", name='" + getName() + "'" +
                ", tel='" + getTel() + "'" +
                ", addr='" + getAddr() + "'" +
                " }";
    }

}
