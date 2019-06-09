import java.io.File;
import java.io.PrintWriter;

//Creating and writing to file using java IO package

public class Tut29
{
	public static void main(String[] args) {
		try{
		File file = new File("files/lorem.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		
		
		PrintWriter pw = new PrintWriter(file);
		pw.println("Vestibulum consectetur eu neque sed vulputate. In ac ante ut nulla ultricies condimentum. Ut dolor magna, ultrices eget augue in, dapibus lacinia metus. Nam tincidunt metus at leo tempus malesuada. Mauris pellentesque eleifend metus non malesuada. Cras et tellus nulla. Donec odio elit, maximus fringilla varius et, gravida at nulla.");
		pw.println("Mauris eget pellentesque arcu. Pellentesque non nulla nec quam egestas euismod. Vivamus ut sapien convallis, bibendum ipsum nec, pellentesque erat. Mauris quis sem eros. Vestibulum condimentum non libero id pulvinar. Sed a nunc libero. Proin rhoncus scelerisque tellus, eget efficitur lectus. Morbi nec lorem eu velit maximus consequat. Aliquam erat volutpat. Fusce sollicitudin feugiat nulla, non aliquet neque pharetra ut. Morbi dictum nibh metus, in placerat purus tincidunt quis. Donec id leo nec nisl tempor feugiat vel a nibh.");
		pw.close();
		System.out.println("Written successfully!");
		
		}catch(Exception e){
			System.out.println("Exception "+e);
		}
	}
}
