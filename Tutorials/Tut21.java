//Recursion in java
//Calling a method from inside itself is recursion
import java.util.Scanner;

public class Tut21
{
	public static void main(String[] args) {
		int factorial = fact(-6);
		System.out.println(factorial);
		
	}
	
	public static int fact(int n){
		if(n<0){
			System.out.println("Factorial undefined!");
			System.exit(0);
		}
		
		if(n==0){
			return(1);
		}
		else{
			return(n*(fact(n-1)));
		}
		}
}


