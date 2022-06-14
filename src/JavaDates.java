import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDates {
	
	
	

	public static void main(String[] args) 
	{
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate bDay = LocalDate.of(1997, 4, 4);
		LocalDate future2Months = bDay.plusMonths(1);
		System.out.println(future2Months);
		Period dur = Period.between(today, future2Months.plusDays(1));
		System.out.println(dur);
		// TODO Auto-generated constructor stub
		
		LocalDateTime abhika = LocalDateTime.now();
		System.out.println(abhika);
		
		System.out.println(abhika.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); 
	}

}
