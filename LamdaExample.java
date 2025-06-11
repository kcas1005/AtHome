import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExample {
    public static void main(String[] args) {
        List<String> names = List.of("샘", "철수", "영희");
        names.forEach(name -> System.out.println(name));

        List<String> names2 = List.of("sam", "kim", "lee");
        names2.stream()
             .filter(name2 -> name2.length() == 3)
             .forEach(System.out::println);
    }
}
