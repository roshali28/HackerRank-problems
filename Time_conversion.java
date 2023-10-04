import java.text.*;
import java.util.*;
public class Time_conversion {
	public static String timeConversion(String s) {
        DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
        DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");
        Date date = null;
        String myDate="";
        try {
            date = inFormat.parse(s); 
        }catch (ParseException e ){
            e.printStackTrace();
        }
        if( date != null ){
            myDate = outFormat.format(date);
        }
        return myDate;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String date = timeConversion(s);
		System.out.println(date);

	}

}
