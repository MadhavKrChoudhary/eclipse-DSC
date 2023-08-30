class Teacher{
	String name;
	double salary;
	public Teacher(String n,double s) {
		name=n;
		salary=s;
	}
	public void Display1() {
		System.out.println("Hi I am Teacher "+name);
	}
	public void Display3() {
		System.out.println("Hi i m display3");
	}
}
class Proctor extends Teacher{
	int extra;
	public Proctor(String n,double s,int e) {
		super(n,s);
		extra=e;
	}
	public void Display1() {
		System.out.println("Hi I m proctor "+name);
	}
	public void Display2() {
		System.out.println("Salary = "+salary);
	}
}
class Hod extends Proctor{
	Hod(String n,double s,int e){
		super(n,s,e);
	}
	public void display3() {
		System.out.println("Hi I am hod diaplay3");
	}
}

class Principle extends Teacher{
	Principle(String n,double s){
		super(n,s);
	}
	
}
public class DynamicMethodDisp {
	public static void main(String args[]) {
		Teacher t=new Teacher("Madhav",20000000);
		t.Display1();
//Dynamic Method Dispatch = Ref SuperCls , Object creation of childClass
		
// if method is present in both class -> ChildClass method envoked
		
// if method is present only in refr cls -> refr cls method wll be envoked
		
// if method is defined only in the class whose obj creation at run time -> Error
		
		Teacher t1=new Proctor("Shyam",10000000,5000);
		t1.Display1();
	//	t1.Display2(); //-> Error
		//Proctor p=new Teacher("Ram",10000); -> Error
		
		Teacher t2=new Hod("XYZ",200000,100);
		t2.Display1();
	//	t2.Display2();
		t2.Display3();
		
		Proctor t4=new Hod("LMN",500000,200);
		t4.Display1();
		t4.Display2();
		t4.Display3();
		
		Teacher t5=new Principle("FGH",3450000);
		t5.Display1();
		// t5.Display2();
		t5.Display3();
		
		Teacher t3=new Proctor("Abc",20000,1000);
		t3.Display3();
	
	}
}
