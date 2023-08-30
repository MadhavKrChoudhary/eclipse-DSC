// Write a program to print the names of students by creating a Student class. If no 
// name is passed while creating an object of Student class, then the name should be 
// "Unknown", otherwise the name should be equal to the String value passed while 
// creating object of Student class.
class Student1{
	String name;
	
	public Student1() {
		name="Unknown";
	}
	
	public Student1(String name) {
		this.name=name;	//	->instance variable hiding 
	}
}

public class ConstructorOops {
	public static void main(String args[]) {
		
		Student1 s = new Student1("abc");
		System.out.println(s.name);
		
		Student1 s1= new Student1();
		System.out.println(s1.name);
		
	}
}
