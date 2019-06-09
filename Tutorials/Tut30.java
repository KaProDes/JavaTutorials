import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

//Reading a file using java IO package

public class Tut30
{
	public static void main(String[] args) {
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("files/lorem.txt"));
			String line;
			while((line = br.readLine())!=null){
				System.out.print(line);
			}
		}catch(IOException err){
			err.printStackTrace();
		}finally{
			try{
				br.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
