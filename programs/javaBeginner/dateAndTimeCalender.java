package javaBeginner;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class dateAndTimeCalender {
	public static void main(String args[]) {
		System.out.println("time is " + System.currentTimeMillis());
		Date d=new Date();
		System.out.println(d);
		   System.out.println("The current date is : "+ d.getDate());
	        System.out.println("The current year is : "+ d.getYear()); //19
	        
	        //calander class
	        Calendar c = Calendar.getInstance();
	        System.out.println(c.getCalendarType()); 
	        System.out.println(c.getTimeZone());
	        System.out.println(c.getFirstDayOfWeek());
	        System.out.println(c.get(Calendar.HOUR));
	        
	        
	        //java.time API
	     LocalDate d1= LocalDate.now();
	     System.out.println(d1);
	     LocalTime t1=LocalTime.now();
	     System.out.println(t1);
	     LocalDateTime ld=LocalDateTime.now();
	     System.out.println(ld);
	     
	     //date time formatter
	     
	     DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/mm/yyyy");
	     DateTimeFormatter k=DateTimeFormatter.ISO_LOCAL_TIME;
	     String mytime=dt.format(ld);
	     System.out.println(mytime);
	     System.out.println(k);
	     
	        
	        
	        
		
	}

}
