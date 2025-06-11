import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);
        System.out.println(list);
        System.out.println(s);

        List<String> list2 = new ArrayList<>();
        list2.add("hello2");
        String s2 = list2.get(0);
        System.out.println(list2);
        System.out.println(s2);
    }
}
