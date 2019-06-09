import java.util.Scanner;
//Methods or functions in Java
public class Tut12
{
	public static void main(String[] args) {
		myPusher("Deshmukh");
		myPusher("Coderman64");
		myPusher("Mememaster2006");
		reverseNumber(121);
		reverseNumber(345);
	}
	
	//This is method and its defined outside main, inside class
	//It is a parameter rich method
	public static void myPusher(String name){
		System.out.println("Welcome "+name);
	}
	
	public static void reverseNumber(int num){
		int t,r;
		int sum = 0;
		t = num;
		while(t!=0){
			r = t%10;
			sum = 10*sum + r;
			t = t/10;
		}
		System.out.println(sum);
		if(num==sum){
			System.out.println(sum+" is a pallindrome");
		}else{
			System.out.println(num+" is not a pallindrome");
		}
	}
}