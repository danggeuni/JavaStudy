package final1.ex;

public class Member {

    private final String id;
    private String name;
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void changeData(String id, String name) {
        //this.id = id; //컴파일 오류 발생
        if(id != null){
            System.out.println("아이디는 변경이 불가능 합니다.");
        }
        this.name = name;
    }
    public void print() {
        System.out.println("id:" + id + ", name:" + name);
    }
}
