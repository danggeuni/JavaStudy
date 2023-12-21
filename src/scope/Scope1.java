package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; //필드 멤버
        if (true) {
            int x = 20; //지역 변수
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } //x 생존 종료

        //System.out.println("main x = " + x); //오류
        System.out.println("main m = " + m);
    } //m 생존 종
}
