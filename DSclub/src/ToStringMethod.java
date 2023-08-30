class Complex{
	int real;
	int img;
	public Complex(int r,int im) {
		real=r;
		img=im;
	}
	
	//String -> return 			toString() -> method name;
	public String toString() {
		return real+"+i"+img;
	}
}

public class ToStringMethod {
	public static void main(String args[]) {
		Complex s = new Complex(-5,200);
		System.out.println(s);
	
	}
}
