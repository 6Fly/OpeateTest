import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDataTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String format = date.format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        System.out.println(format);
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());

        LocalDate nextDate = date.plus(1, ChronoUnit.YEARS);
        System.out.println(nextDate.getYear());
        System.out.println(nextDate.getMonthValue());
        System.out.println(nextDate.getDayOfMonth());
    }
}
