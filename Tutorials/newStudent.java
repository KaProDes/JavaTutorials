//Student class with access modifier and getter and setter methods
//When this .java file is executed a .class file is generated
//Once compiled, the ground rules are generated for good
//It need not be compiled again and again
//Similar to structures in C

public class newStudent{
	private	int id;
	private	String name;
	private	int age;
	private	int marks;
	
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public int getAge(){
		return age;
	}
	public int getMarks(){
		return marks;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setMarks(int marks){
		this.marks=marks;
	}
}