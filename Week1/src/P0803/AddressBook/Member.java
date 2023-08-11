package P0803.AddressBook;

/*
 * VO
 */

public class Member {
    // private. 클래스 밖에서 안보임. get and set 제공
    private String name;
    private String tel;
    private String address;
    

    public Member() { }
    public Member(String name, String tel, String address) {
        // this. 현재 객체를 의미
        // this.변수 = 멤버변수
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
            " 이름 = '" + getName() + "'" +
            ", 전화번호 = '" + getTel() + "'" +
            ", 주소 = '" + getAddress() + "'" +
            " }";

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

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
