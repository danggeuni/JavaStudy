package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;

        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }

        System.out.println("m = " + m);

//        temp를 필드로 선언하여 불필요한 메모리를 사용
//        if 구문 내에서만 사용되나 외부에서 선언되어 코드의 복잡성이 증가
    }
}
