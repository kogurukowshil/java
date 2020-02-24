import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Test
{
public static void main(String[]args)
{
LocalDate date=LocalDate.now();
System.out.println("default format of LocalDate="+date);
System.out.println("pattern"+date.format(DateTimeFormatter.ofPattern"d::MMM::uuuu"));
LocalTime lt=LocalTime.now();
System.out.println("default format of LocalDateTime="+dateTime);
System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::MM::SS"));
System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE);
}
}