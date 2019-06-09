import java.util.*;
//Handling exceptions in java using try-catch blocks
//An exception is an event that occurs during execution of a program
//that distrupts the normal flow of the program

//Exception with higher priority is caught and executed
//We can have multiple catch blocks for a sinle try block
//Gneral exception catch block should always come at the end

public class Tut27
{
	public static void main(String[] args) {
		int[] b = new int[2];
		try{
			//int a = 100/0;
			System.out.println("Value of b at index 3 = "+b[3]);
			
		}catch(ArithmeticException err){
			System.out.println("The exception is "+err);
		}catch(Exception err){
			System.out.println("The exception is "+err);
		}
		System.out.println("---------");
		
	}
}
