import java.util.Scanner;
public class Tut14
{
	public static void main(String[] args) {
		//Raju is an object alias an instance of the class Student
		//Once the rules for a class are set and it is compiled, the ground rules are pretty much set
		//Dot operator is pretty much like C
		newStudent Raju = new newStudent();
		Raju.id = 25;
		Raju.name = "Raju Srivastava";
		Raju.marks = 82;
		Raju.age = 21;
		
		System.out.println("Name: "+Raju.name);
		System.out.println("ID: "+Raju.id);
		System.out.println("Marks: "+Raju.marks);
		System.out.println("Age: "+Raju.age);
		
		System.out.println("Name is "+Raju.name+" with ID "+Raju.id);
		System.out.println("and marks are "+Raju.marks+" aged "+Raju.age);
		
		//Look up getters and setters methods of encapsulation
	}
}

