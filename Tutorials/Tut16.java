//Method overloading
//Same method name, different return type 
import java.util.Scanner;
public class Tut16
{
	public static void main(String[] args) {
		int i = Add(15,25);
		double j = Add(15.22,26.96);
		String k = Add("Hello ","Java Nibba");
		System.out.println(i+" "+j+" "+k);
		
	}
	
	public static int Add(int a, int b){
		return(a+b);
	}
	
	public static double Add(double a, double b){
		return(a+b);
	}
	
	public static String Add(String a, String b){
		return(a+b);
	}
}

