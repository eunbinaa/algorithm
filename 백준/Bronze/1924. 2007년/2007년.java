import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String[] arr=str.split(" ");
        int month_=Integer.parseInt(arr[0]);
        int date_=Integer.parseInt(arr[1]);
        LocalDate date= LocalDate.of(2007, month_, date_);
        DayOfWeek dayofWeek = date.getDayOfWeek();
        int dayOfWeekNum=dayofWeek.getValue();
       
	    switch(dayOfWeekNum) {
	    case 1 :
	    	System.out.println("MON");
	    	break;
	    case 2 :
	    	System.out.println("TUE");
	    	break;
	    case 3 :
	    	System.out.println("WED");
	    	break;
	    case 4 :
	    	System.out.println("THU");
	    	break;
	    case 5 :
	    	System.out.println("FRI");
	    	break;
	    case 6 :
	    	System.out.println("SAT");
	    	break;
	    case 7 :
	    	System.out.println("SUN");
	    	break;
	    }
	}
}