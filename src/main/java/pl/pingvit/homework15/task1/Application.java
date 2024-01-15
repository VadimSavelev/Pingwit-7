package pl.pingvit.homework15.task1;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/*В классе Application создайте строки: '2023-17-01', '23-2022-01', '15-07-2022'.
Распарсите эти строки в объекты LocalDate, используя DateTime formatter.
Каждую полученную дату выведите в консоль в нескольких форматах:
01-Mar-2022, Mar-01-2022, 2022-01-Mar, 01-March-2022
Создайте объект LocalDateTime и выведите его в консоль в каком-то нетипичном формате на ваше усмотрение.
 */
public class Application {
    public static void main(String[] args) {
        String dateOne = "2023-17-01";
        String dateTwo ="23-2022-01";
        String dateThree ="15-07-2022";

        DateTimeFormatter dateTimeFormatter1 =DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter dateTimeFormatter2 =DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        DateTimeFormatter dateTimeFormatter3 =DateTimeFormatter.ofPattern("yyyy-dd-MMM");
        DateTimeFormatter dateTimeFormatter4 =DateTimeFormatter.ofPattern("dd-MMMMM-yyyy");

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        LocalDate parseDateOne = LocalDate.parse(dateOne, pattern);
        String dateOneFormatted1 = parseDateOne.format(dateTimeFormatter1);
        String dateOneFormatted2 = parseDateOne.format(dateTimeFormatter2);
        String dateOneFormatted3 = parseDateOne.format(dateTimeFormatter3);
        String dateOneFormatted4 = parseDateOne.format(dateTimeFormatter4);

        DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("dd-yyyy-MM");
        LocalDate parseDateTwo = LocalDate.parse(dateTwo, pattern1);
        String dateTwoFormatted1 = parseDateTwo.format(dateTimeFormatter1);
        String dateTwoFormatted2 = parseDateTwo.format(dateTimeFormatter2);
        String dateTwoFormatted3 = parseDateTwo.format(dateTimeFormatter3);
        String dateTwoFormatted4 = parseDateTwo.format(dateTimeFormatter4);

        DateTimeFormatter pattern2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parseDateThree = LocalDate.parse(dateThree, pattern2);
        String dateThreeFormatted1 = parseDateThree.format(dateTimeFormatter1);
        String dateThreeFormatted2 = parseDateThree.format(dateTimeFormatter2);
        String dateThreeFormatted3 = parseDateThree.format(dateTimeFormatter3);
        String dateThreeFormatted4 = parseDateThree.format(dateTimeFormatter4);

        String[] dates ={dateOneFormatted1,dateOneFormatted2,dateOneFormatted3,dateOneFormatted4,dateTwoFormatted1,dateTwoFormatted2,dateTwoFormatted3,dateTwoFormatted4,dateThreeFormatted1,dateThreeFormatted2,dateThreeFormatted3,dateThreeFormatted4};
        for (String stringDates : dates) {
            System.out.println(stringDates);

            DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("HH/mm/a/EEEE : yyyy-dd-MMMM-G").localizedBy(Locale.ENGLISH);
            LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println(newPattern.format(localDateTime));
        }
    }
}

