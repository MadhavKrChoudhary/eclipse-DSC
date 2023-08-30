class Student{
	String name;
	int id=20;
	
//	Student(){
//		System.out.println("Hi , I am Ram");
//	}
	
//	Student(String n, int Id){
//		name=n;
//		id=Id;
//	}
	
	Student(int x){
		id=x;
	}
}

public class ConstructorClass {
	public static void main(String args[]) {
		
		Student s = new Student(10);
		System.out.println(s.id);
		
	}
}
