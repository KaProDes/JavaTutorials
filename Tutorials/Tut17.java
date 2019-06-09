//Static blah blah, sharing by instances  etc.
//Private keywords and restriction and Access modification
import java.util.Scanner;
public class Tut17
{
	public static void main(String[] args) {
		newStudent Raju = new newStudent();
		Raju.setId(25);
		Raju.setName("Raju Srivastava");
		Raju.setMarks(82);
		Raju.setAge(21);
		
		System.out.println("Name: "+Raju.getName());
		System.out.println("ID: "+Raju.getId());
		System.out.println("Marks: "+Raju.getMarks());
		System.out.println("Age: "+Raju.getAge());
		
		System.out.println("Name is "+Raju.getName()+" with ID "+Raju.getId());
		System.out.println("and marks are "+Raju.getMarks()+" aged "+Raju.getAge());
	}
}

