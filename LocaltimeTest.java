import java.time.*;

public class LocaltimeTest {
 public static void main(String[] args) {
   LocalDate date = LocalDate.now();
   LocalTime time = LocalTime.now();
   LocalDateTime datetime = LocalDateTime.now();

    System.out.println(date);
    System.out.println(time);
    System.out.println(datetime);
 }
}
