import java.util.*;
//ListIterator through ArrayList
public class Tut25
{
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>(); 
		names.add("James");
		names.add("Charles");
		names.add("Mark");
		names.add("Joseph");
		names.add("Kane");
		names.add("James");
		
		ListIterator<String> itr = names.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("");
		
		while(itr.hasPrevious())
			System.out.println(itr.previous());
		
		System.out.println("");
		
		
	}
}


