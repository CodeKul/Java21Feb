package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class LocalDateDemo {
    public static void main(String[] args) {

        Date dt = new Date();

        System.out.println(dt);

        System.out.println(System.currentTimeMillis());

        Date dt1 = new Date(1684488851773L);
        System.out.println(dt1);

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.UK);
        System.out.println(dateTimeFormatter.format(localDate));

        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1.plusDays(4));
        System.out.println(localDate1.minusDays(4));
        System.out.println(localDate1.getEra());
        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate1.getDayOfWeek());
        System.out.println(localDate1.getDayOfYear());


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());

        ZoneId zoneId = ZoneId.of("Australia/Sydney");
        System.out.println(zoneId);
        LocalDate localDate2 = LocalDate.now(zoneId);
        System.out.println(localDate2);

        LocalTime localTime1 = LocalTime.now(zoneId);
        System.out.println(localTime1);

        LocalDate localDate3 = LocalDate.of(2000,9,12);
        LocalDate localDate4 = LocalDate.of(2010,8,20);

        Period period = Period.between(localDate3,localDate4);
        System.out.println(period);

        LocalTime localTime2 = LocalTime.of(14,0,0);
        LocalTime localTime3 = LocalTime.of(4,12,10);

        Duration duration = Duration.between(localTime2,localTime3);

        System.out.println(duration);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
