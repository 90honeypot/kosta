package P0803.AddressBook;

/*
 * Dao
 * - Member를 여려개 담을 수 있는 배열 생성
 * - 그 배열에 Member 객체를 추가, 검색, 수정, 삭제 ... 작업 클래스
 */

public class MemberDao {

    private Member[] datas;
    private int count;

    public int getCount() {
        return this.count;
    }
    public Member[] getDatas() {
        return datas;
    }

    public MemberDao() {
        datas = new Member[30];
        count = 0;
    }

    // 1. 추가 : 파라미터로 Member객체를 받아서 배열에 추가
    public boolean add(Member mem) { // m은 service에서 추가할 사람의 이름, 전화, 주소 입력
        if (count >= datas.length) {
            return false;
        }
        datas[count++] = mem;
        return true;
    }

    // 2. 검색
    public int getIdxByName(String name) {
        int idx = -1;
        for (int i = 0; i < count; i++) {
            if (name.equals(datas[i].getName())) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    public Member search(int idx) {
        return datas[idx];
    }

    // 3. 수정, 있는걸로 가능.

    // 4. 삭제
    public void delete(int idx) {
        for (int i = idx; i < count - 1; i++) {
            datas[idx] = datas[idx + 1];
        }
        count--;
    }

    // 5. 전체 출력
    public void getAll() {
        for(int i=0; i<count; i++) {
            System.out.println(datas[i].toString());
        }
        System.out.println();
    }

    public int getMemberCount() {
        return count;
    }

}
