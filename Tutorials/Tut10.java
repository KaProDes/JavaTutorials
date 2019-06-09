import java.util.Scanner;
public class Tut10
{
	public static void main(String[] args) {
	//Strings
	String string0 = "JavaC";
	System.out.println(string0);
	int strlen0 = string0.length();
	System.out.println(strlen0);
	//Converting to lowercase
	String string1 = string0.toLowerCase();
	System.out.println(string1);
	//Converting to uppercase
	String string2 = string0.toUpperCase();
	System.out.println(string2);
	
	System.out.println(string0.replace('a','e'));
	}
}