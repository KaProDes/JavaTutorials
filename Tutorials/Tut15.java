import java.util.Scanner;
public class Tut15
{
	public static void main(String[] args) {
		//Cube() is the constructor of Cube class
		//By convention they have the same name
		//cube1 is the instance of the cube class
		Cube cube1 = new Cube();
		//Lets print something out using default constructor vals
		
		System.out.println(cube1.getCubeVolume());
		
		//Other than that we can override and pass parameters
		cube1.l = 70;cube1.b = 60;cube1.h = 90;
		System.out.println(cube1.getCubeVolume());
		
		//From the non-default constructor
		
		Cube cube2 = new Cube(20,20,20);
		System.out.println(cube2.getCubeVolume());
		
	}
}

