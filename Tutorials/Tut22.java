import java.util.ArrayList;
import java.util.Scanner;

//An arraylist is a dynamically prepared array of variable size

public class Tut22
{
	public static void main(String[] args) {
		//Here is a simple array of 5 elements
		int[] simple_array = new int[5];
		System.out.println("Enter elements of the array");
		int i = 0;
		while (i<5)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter element indexed "+i);
			simple_array[i] = scan.nextInt();
			i++;
		}
		
		//Here is an arraylist
		ArrayList<Integer> array_list = new ArrayList<Integer>(5);
		
		//While iterating if we exceed size of the array_list
		//It will auto-accomodate(5 to 7)		
		System.out.println("Enter elements of the arraylist");
		i = 0;
		while (i<7)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter element indexed "+i);
			array_list.add(scan.nextInt());
			i++;
		}
		System.out.println("");
		for(Integer x : array_list){
			System.out.println(x);
		}
		System.out.println("");
		System.out.println("This AL is of "+array_list.size());
		
		//Removing an element at an index
		array_list.remove(2);
		
		//Setting a value at an indedx using the .set(index,value) method
		array_list.set(4,69);
		
		System.out.println("");
		for(Integer x : array_list){
			System.out.println(x);
		}
		System.out.println("");
		System.out.println("This AL is of "+array_list.size());
		
		//using array_list.clear() we can empty the array out.
		//Array_list gets resized to 0 by this command
		
		array_list.clear();
		System.out.println("");
		System.out.println("This AL is of "+array_list.size());
		//.trimToSize() resets the array_list to the number of elements it contains
		//i.e. gets rid of overprovisioning
	}
}


