
// datatype arrayname[] = new datatype[n];
// datatype []arrayname=new datatype[n];

import java.util.*;
public class DatatypesConcept {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter the value");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]+"\t");
		}
	//-----> Method 2
		int arr2[]= {5,6,7,8,9};
		
		int sum=0;
		for(int i=0;i<5;i++) {
			sum=sum+arr2[i];

		}
		System.out.println(sum);
	}
}
