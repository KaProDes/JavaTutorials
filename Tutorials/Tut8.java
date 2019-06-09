import java.util.Scanner;
public class Tut8
{
	public static void main(String[] args) {
	//Arrays in java
	//ini
	//Prefered way
	int[] array0 = {1,5,8,9,12};
	//Another way
	int array1[] = {1,9,6,75};
	//
	int[] array2 = new int[5];
	int[] array3 = new int[]{1,5,7};
	
	int i =0;
	
	while(i<5)
	{
		System.out.print(array0[i]+" ");
		i++;
	}
	i = 0;
	
	System.out.println("");
	//Taking userinput and printing out the elements of an array
	
	while (i<5)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter element indexed "+i);
		array2[i] = scan.nextInt();
		i++;
	}
	
	System.out.println("Elements of array2");
	
	i = 0;
	while(i<5)
	{
		System.out.print(array2[i]+" ");
		i++;
	}
	
	}
}