import java.util.Scanner;
//Methods or functions in Java
public class Tut11
{
	public static void main(String[] args) {
		myFirstMethod();
	}
	
	
	//This is method and its defined outside main, inside class
	public static void myFirstMethod(){
		System.out.println("Hello java over here!");
		myFirstMethod();
		//Adding a recursion to the party
	}
}