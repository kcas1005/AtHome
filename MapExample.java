import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<>();

        scoreMap.put("샘", 90);
        scoreMap.put("철수", 85);
        scoreMap.put("샘", 100);

        System.out.println("Map 출력 : " + scoreMap);
        System.out.println("샘의 점수 : " + scoreMap.get("철수"));
    }
}
