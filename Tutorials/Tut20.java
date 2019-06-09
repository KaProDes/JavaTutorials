//Polymorphism in java
//files used : Bank.java, Bank_ABC.java, Bank_XYZ.java, Bank_DEF.java
//Method overridding is the phenomenon where method from Parent class
//is forfeited in favor of the child class' method
//the arguments for both methods must be tightly compatible
//Method overloading is done in the same class
import java.util.Scanner;
public class Tut20
{
	public static void main(String[] args) {
		//Notice how class is bank but constructor is BANK_PQR
		Bank abc = new Bank_ABC();
		Bank def = new Bank_DEF();
		Bank xyz = new Bank_XYZ();
		
		System.out.println(abc.getInterestRate());
		System.out.println(def.getInterestRate());
		System.out.println(xyz.getInterestRate());
		
	}
}

