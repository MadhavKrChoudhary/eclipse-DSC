//Compiler --> High level to machine level
//Interpreter --> Line by line execution 

// 1 main class -> represented by public keyword
// Execution will start from main method
// In JAVA, String is defined like a class
// Class --> first letter of each word capital
// method --> pehla word --> small,
//   		Baki word ka first letter capital
// Main class ke ander koi v method define krege
//					to static keyword ka use krege
public class FirstPgm {
	public static void main(String args[]) {
		System.out.println("Welcome to JAVA Lang");
		System.out.print("Hi"); // ln-->pehle print krega 
		                        //fir line break krega
		System.out.printf(" Goodmorning !!");
		System.out.println("Ram");
	
		String name="Madhav";	// name --> variable
								// String --> Datatype
		
		System.out.println("My name is "+name);
		
		// Arithmetic operations
		
		int a ;
		a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Sum is : "+sum);
	}
}
//Print() :
//       System.out.printf()
//        print()
// 		  println()

// Capital letter, small letter --> case sensitive
// Jab v variable create krege -> Datatype declare krege


//Go through all the syntax and line explained here
// Arithmetic operation perform krna hai -,*,/,%
// try with int and float both