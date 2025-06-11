import java.time.LocalDate;

public class Pulsdaystest {
    public static void main (String[] args){
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate lastWeek = today.minusDays(1);
        
        System.out.println(tomorrow.isAfter(lastWeek));
    }
}
