import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args){
        // Set<Integer> numbers = new HashSet<>();
        Set<String> numbers = new HashSet<>();

        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(1);

        numbers.add("sam");
        numbers.add("2");
        numbers.add("sam");
        
        System.out.println("Set 출력 " + numbers);
    }
}
