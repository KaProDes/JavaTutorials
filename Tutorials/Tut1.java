import java.util.Scanner;
public class Tut1
{
	public static void main(String[] args) {
	    //Integer Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int user_int = scan.nextInt();
		System.out.print("The integer input by the user is ");
		System.out.println(user_int);
		//String Scanner-Backspace permitted but not validated
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a character:");
	    String user_char = scan1.nextLine();
		System.out.print("The user entered string is ");
		System.out.println(user_char);
		//Double Scanner - Will be auto-truncated
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		double user_double = scan2.nextDouble();
		System.out.print("The user entered double is ");
		System.out.println(user_double);
	}
}