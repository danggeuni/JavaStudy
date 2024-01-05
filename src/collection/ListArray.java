package collection;
import java.util.ArrayList;
import java.util.List;

public class ListArray {
//    컬렉션은 동일한 타입을 묶어 관리하는 공간입니다.
//    배열과 다른점은 공간이 동적으로 변한다는 것입니다.
    public static void main(String[] args) {
//        리스트는 인터페이스고, ArrayList, Vector, LinkedList 는 구현체가 됩니다.
        List<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("가");
        System.out.println(list);
        list.add(1,"나");
        System.out.println(list);
    }
}
