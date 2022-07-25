package Collection.PracticeSet;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

// used for the class
/** This clas is to demonstrate what javadoc is and how it is used int the java industry.
 * @author Aman Gupta
 * @version 1.2.3
 * @since 2021
 * @see <a href=https://docs.oracle.com/en/java/javase/14/docs/api/index.html target="_blank">JavaDocs</a>
 */
public class Main {
    /**
     *
     * @param args These are the arguments supplied to the command line
     */
    public static void main(String[] args) {
        // Question 1
        List<String> studentList = new ArrayList<>();
        studentList.add("student_1");
        studentList.add("student_2");
        studentList.add("student_3");
        studentList.add("student_4");
        studentList.add("student_5");
        studentList.add("student_6");
        studentList.add("student_7");
        studentList.add("student_8");
        studentList.add("student_9");
        studentList.add("student_10");

        for (String student:studentList) {
            System.out.print(student + ", ");
        }

        //Question 2
        Date date = new Date();
        System.out.println("\nUsing date class: "+  date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());

        // Question 3 => Calendar Class
        Calendar calendar = Calendar.getInstance();
        System.out.println("\nUsing Calender class: " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        // Question 3 => using java.api.Time
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("H:m:s");

        String timeAfterFormat = localTime.format(dateTimeFormatter);

        System.out.println("\n"+ localTime);
        System.out.println("Using java.api.Time Class: "+ timeAfterFormat);

        // Question 4
        Set<Integer> setOfNumbers = new HashSet<>();

        setOfNumbers.add(12);
        setOfNumbers.add(13);
        setOfNumbers.add(12);

        System.out.print("\nSet of Numbers: ");
        for(Integer number: setOfNumbers) {
            System.out.print(number + ",");
        }
    }
}
