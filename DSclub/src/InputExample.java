import java.util.Scanner;  // java.util.*;

//Input lene ke liye ek object chahiye
// 			Scanner  -> class ka jo ki in-built
// 
//object bnane ka trika 
//  ClassName obj = new ClassName(); // new-> obj create
public class InputExample {
	public static void main(String args[]) {
		
		// Input lene ke liye ek object bnana prega
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s.nextInt();
		// float a=sc.nextFloat(); -> float value ke liye
		// String name=sc.next();
		// String name1=sc.nextLine();  // -> Find yourself
		
		System.out.println("Enter second number");
		int b=s.nextInt();
		
		int sum=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+sum);
	}
}
