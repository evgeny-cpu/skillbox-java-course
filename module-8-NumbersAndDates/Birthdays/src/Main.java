import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EE").localizedBy(Locale.ENGLISH);
        String result = "";
        int i = 0;
        while (!birthday.isAfter(now)) {
            result += i + " - " + formatter.format(birthday) + System.lineSeparator();
            birthday = birthday.plusYears(1);
            i++;
        }
        return result;
    }
}