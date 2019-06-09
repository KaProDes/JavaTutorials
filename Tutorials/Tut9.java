import java.util.Scanner;
public class Tut9
{
	public static void main(String[] args) {
	//For loops
	int i=0;
	for(i=0;i<5;i++)
	{
		System.out.println("Hello "+i);
	}
	System.out.println("");
	//Another one
	int[] array0 = {12,78,25,256,122};
	
	for(i=0;i<5;i++)
	{
		System.out.print(array0[4-i]+" ");
	}
	System.out.println("");
	//Easy way of sequential iteration in array using for loop
	for(int element : array0)
	{
		System.out.print(element+" ");
	}
	
	}
}