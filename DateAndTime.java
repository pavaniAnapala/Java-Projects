package src;
import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;


public class DateAndTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		System.out.println(getDay(day, month, year));
		in.close();

	}

	private static String getDay(String day, String month, String year) {
		
		Calendar c = Calendar.getInstance();
		//c.set(Integer.valueOf(year), Integer.valueOf(month)-1, Integer.valueOf(day));
	//	c.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
		c.set(Calendar.DAY_OF_MONTH,Integer.parseInt(day));
		c.set(Calendar.MONTH, (Integer.parseInt(month)-1));
		c.set(Calendar.YEAR,Integer.parseInt(year));
		//System.out.println(c.DATE);
		 String dayOfWeek = c.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.US);
		 
		 return dayOfWeek.toUpperCase();
		
		/*String dayOfWeek = "";
		switch(c.get(Calendar.DAY_OF_WEEK)){
		case 1: dayOfWeek = "Sunday"; break;
		case 2 : dayOfWeek = "Monday"; break;
		case 3 : dayOfWeek = "Tuesday"; break;
		case 4: dayOfWeek = "Wednesday"; break;
		case 5 : dayOfWeek = "Thursday"; break;
		case 6 : dayOfWeek = "Friday"; break;
		case 7 : dayOfWeek = "Saturday"; break;
				
		}
		return dayOfWeek.toUpperCase();
		}*/
	}

}
