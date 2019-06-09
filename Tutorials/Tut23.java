import java.util.LinkedList;
import java.util.Scanner;

public class Tut23
{
	public static void main(String[] args) {
		LinkedList<String> linked_list = new LinkedList<String>();
		System.out.println("");
		linked_list.add("Monish");
		linked_list.add("Jaggu");
		linked_list.add("Bhaloo");
		linked_list.add("Nathaniel");
		linked_list.addFirst("Gabbar");
		linked_list.addLast("Thakur");
		linked_list.removeFirst();
		linked_list.add(3,"Kermit");
		linked_list.remove(2);
		linked_list.set(3,"Fibonacci");
		//linked_list.clear();
		System.out.println(linked_list.size());
		
		for(String x : linked_list){
			System.out.println(x);
		}
	}
}


