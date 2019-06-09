import java.util.Date;
import java.text.*;
//Fun with date-time API in java
public class Tut31
{
	public static void main(String[] args) {
		Date date = new Date();
		//Formated date and time
		System.out.println(date.toString());
		//Epoch time from 01/01/1970
		System.out.println(date.getTime());
		//Some mods
		String dtinfo = (String)date.toString();
		String[] splited = dtinfo.split("\\s+");
		for(String x : splited){
			System.out.println(x);
		}
		System.out.println("");
		System.out.println("For feminists and SJWs, current year: "+splited[5]);
		System.out.println("For basic ass people, KEEP CALM IT IS : "+splited[1].toUpperCase());
		//Get year
		System.out.println("Current year : "+((int)(1900+date.getYear())));
		
		//Using text formatting
		SimpleDateFormat sdf = new SimpleDateFormat("E dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf.format(date));
	}
}
