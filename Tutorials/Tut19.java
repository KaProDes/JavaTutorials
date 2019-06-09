//Inheritance
//files and classes used : Polygon.java, Rectangle.java, Triangle.java
import java.util.Scanner;
public class Tut19
{
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Triangle tri1 = new Triangle();
		
		rect1.set_values(10,10);
		tri1.set_values(10,10);
		
		System.out.println("Area of Rectangle : "+rect1.area());
		System.out.println("Area of Triangle : "+tri1.area());
	}
}

