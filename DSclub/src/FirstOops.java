// class -> Caps latter of each word
//       e.g ->  MyDisplay 
// methods -> small ltr for first word,
//            caps for the next word
//     e.g ->  myDisplay()

class A{
	int a=10;
	int b=20;
	
	public void add() {				// void -> no return type
		int sum=a+b;
		System.out.println("sum = "+ sum);
	}
	
	public int sub() {    // int -> return type -> will int
		int subtract=a-b;
		return subtract ;
	}
}

public class FirstOops {
	public static void main(String args[]) {
		
		A objA = new A();
		System.out.println(objA.a);
		objA.add();
		
		System.out.println("Subtract = " + objA.sub());
	}
}


//Syntax for declaring an object
		// ClassName obj; -> Reference of object
		// obj = new ClassName() 
		
		//ClassName obj = new ClassName();


// Escape Sequence Character
// Token
// Keywords
// Varibale
// Literals
// Data types
// Operators