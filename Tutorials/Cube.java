public class Cube {
	int l;
	int b;
	int h;
	
	public int getCubeVolume(){
		return (l*b*h);
	}
	//Defining a constructor
	//If not defined in class file it is defaulted by the compiler
	Cube () {
		//System.out.println("We are in Cube constructor");
		//Setting default parameter values for constructor
		l = 10;
		b = 20;
		h = 30;
	}
	
	//Constructor overloading
	
	Cube (int length, int bredth, int height) {
		l = length; b = bredth; h = height;
		
	}
	
}