import java.util.Scanner;
public class Tut6
{
	public static void main(String[] args) {
		//Not very useful. More study needed
		int score = 60;
		switch (score)
		{
			case 90:
				System.out.println("Excellent!");
				break;
			case 70:
				System.out.println("Good");
				break;
			case 50:
				System.out.println("Passed");
				break;
			default:
				System.out.println("You have failed. Consider rechecking!");
				break;
		}
		System.out.println("Thanks for checking the score!");
	}
}