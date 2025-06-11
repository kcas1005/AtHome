import java.util.Arrays;
import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {

        // 1. Object 기본 메서드 (toString, equals)
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("1. obj1.equals(obj2): " + obj1.equals(obj2)); // false (주소 비교)
        System.out.println("1. obj1 == obj2     : " + (obj1 == obj2));
        System.out.println("1. obj1.toString(): " + obj1.toString());     // 클래스@해시코드 형태
        System.out.println("1. obj2.toString(): " + obj2.toString());     // 클래스@해시코드 형태

        // 2. StringBuilder로 문자열 연결
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Sam!");
        System.out.println("2. StringBuilder 결과: " + sb.toString()); // Hello Sam!

        // 3. 배열 정렬 + 출력
        int[] arr = {5, 3, 1, 4, 2};
        Arrays.sort(arr);
        System.out.println("3. 정렬된 배열: " + Arrays.toString(arr)); // [1, 2, 3, 4, 5]

        // 4. 현재 날짜와 시간
        LocalDateTime now = LocalDateTime.now();
        System.out.println("4. 현재 시각: " + now); // 2025-06-05T14:03:00 형태
    }
}
