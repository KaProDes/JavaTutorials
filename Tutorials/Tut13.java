import java.util.Scanner;
//Methods or functions in Java
public class Tut13
{
	public static void main(String[] args) {
		simpleAdd(12,13);
		simpleAdd(36,45);
		simpleAdd(28,92);
		int c = returnCalc(56,22);
		System.out.println("The calculator says "+(2*c));
	}
	
	//Simple adding utility for two numbers
	public static void simpleAdd(int a, int b){
		int c;
		c = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
	
	//Same thing but with int return type
	public static int returnCalc(int a, int b){
		return(a+b);
	}
	
	
}