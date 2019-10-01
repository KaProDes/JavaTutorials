import java.io.FileWriter; 
import java.io.IOException; 
//This is simple usecase of writing a string to an output file.
public class FileHandler 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		String str = "File Handling in Java using "+ 
				" FileWriter and FileReader"; 
		FileWriter fw=new FileWriter("output.txt"); 
		for (int i = 0; i < str.length(); i++) 
			fw.write(str.charAt(i));
		System.out.println("Writing successful"); 
		fw.close(); 
	} 
}
