package DateTime;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        // Date and Time
        /**
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("Number of seconds: "+ System.currentTimeMillis()/1000);
        System.out.println("Number of minutes: "+ System.currentTimeMillis()/1000/6000);
        System.out.println("Number of hours: "+ System.currentTimeMillis()/1000/3600);
        System.out.println("Number of days passed: "+ System.currentTimeMillis()/1000/3600/24);
        System.out.println("Year Passed: "+ System.currentTimeMillis()/1000/3600/24/365);

         if(Long.MAX_VALUE >= System.currentTimeMillis()) {
            long timePassed = System.currentTimeMillis();
            System.out.println(timePassed);
        } else {
            System.out.println("Not possible.");
        }

        Date date = new Date(122, 6, 11);
        System.out.println(date);


        // Calender Class => Abstract Class
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Hong_Kong"));
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTimeZone().getID());
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        for(int count = 0; count <= 5; count++) {
            System.out.print(TimeZone.getAvailableIDs()[count] + ", ");
        }
         **/

        LocalDate localDate = LocalDate.now();  // Prints the current time
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();  // Prints the current time and includes the nanoseconds
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);  // Time

        // DateTimeFormatter.
        DateTimeFormatter dateTimeFormatter_1 = DateTimeFormatter.ofPattern("dd/LL/YYYY --- q");
        DateTimeFormatter dateTimeFormatter_2 = DateTimeFormatter.ISO_WEEK_DATE;    // Formatter for the Time and Date

        String myDate_1 = localDateTime.format(dateTimeFormatter_2);
        String myDate_2 = localDateTime.format(dateTimeFormatter_1);

        System.out.println(myDate_1);
        System.out.println("\n");
        System.out.println(myDate_2);
    }
}
