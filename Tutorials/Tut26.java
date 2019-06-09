import java.util.*;
//Hashsets in java that cannot contain duplicate values
public class Tut26
{
	public static void main(String[] args) {
		HashSet<String> name  = new HashSet<String>();
		name.add("Mark");
		name.add("Jack");
		name.add("Frank");
		name.add("Gerrad");
		name.add("Mark");
		
		//Will ignore duplicate values and merge
		
		Iterator<String> itr = name.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("");
		
	}
}
