import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();

        names.add("샘");
        names.add("철수");
        names.add("샘");
        names.remove(2);
        
        System.out.println("List 출력 : " + names);
        System.out.println("두 번째 요소 : " + names.get(2));
    }

}
