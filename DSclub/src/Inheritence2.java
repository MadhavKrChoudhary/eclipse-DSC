class Shape1{
	int length;
	int breadth;
	public Shape1(int i,int j) {
		length=i;
		breadth=j;				//--> Super Class
	}
	void area() {
		System.out.println("Area of shape");
	}
}

class Rectangle1 extends Shape1{	 //-->takes Variable of SuperClass
	public Rectangle1(int a,int b) {
		super(a,b);	//-->go to superclass and find constrctor
	}						//--> Child class of shape
	void area() {		//-> Method over riding
		super.area();
		System.out.println("Area of Rectangle="+(length*breadth));
	}
}

class Cuboid1 extends Shape1{ 
	int height;
	public Cuboid1(int a,int b,int c) {
		super(a,b); 			//-> 2 variable Goes to superclass	
		height=c;
	}				//--> Child class of shape
//	public void area() {		// area method overridden
//		System.out.println("Area couboid ="+(length*breadth*height));
//	}
}
public class Inheritence2 {
	public static void main(String args[]) {
		Rectangle1 r=new Rectangle1(10,5);
		r.area();
		Shape1 s=new Shape1(10,20);
		s.area();
		Cuboid1 c=new Cuboid1(10,2,3);
		c.area();
	}
}

//-> Whenever a child class will not override the method
//-> SuperClass method will be automatically called by childclass
