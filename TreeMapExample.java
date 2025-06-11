import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("banana", 3);
        map.put("apple", 5);
        map.put("cherry", 2);
        System.out.println(map); // 자동으로 키 정렬되어 출력
    }
}
