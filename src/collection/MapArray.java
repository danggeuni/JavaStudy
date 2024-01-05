package collection;

import java.util.HashMap;
import java.util.Map;

public class MapArray {

    public static void main(String[] args) {
//        맵은 key 와 value를 쌍으로 갖고 있습니다. 또한 key 값이 set으로 관리되어 입출력 순서가 동일하지 않습니다.
    Map<Integer,String> map = new HashMap<>();
        map.put(5, "가");
        map.put(10, "나");
        map.put(15, "다");
        map.put(20, "라");
        map.put(25, "마");
        System.out.println(map);
    }

}
