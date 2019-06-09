import java.util.*;
//Finally block always executes when the try block exits
//This ensures that finally block is executed even if an unexpected
//exception occurs
//In case System.exit(0) is called inside try block without exception, 
//finally will not be Executed

//Even if a try block return occurs, finally will be called
//Finally will override all returns and reassign and return variable
//values if need be
//Please revisit - this is heavy


public class Tut28
{
	public static void main(String[] args) {
		int[] b = new int[2];
		try{
			int a = 100/0;
			System.exit(1);
		}catch(ArithmeticException err){
			System.out.println("The exception is "+err);
			System.out.println("---------");
		}finally{
			System.out.println("finally has been summoned");
			System.out.println("---------");
		}
		System.out.println("Outside the t-e-f block");
		
	}
}
