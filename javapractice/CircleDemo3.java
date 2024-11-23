//Constructor Overloading
class Circle{
	double x,y;
	double r;
	//first Constructor
	Circle (double x,double y,double r)
	{
		this.x=x;this.y=y;this.r=r;
	}
	//Second Constructor
	Circle(double r)
	{
		x=0;y=0;this.r=r;
	}
	//Third constructor
	Circle (Circle c)
	{
		x=c.x;y=c.y;r=c.r;
	}
	//Forth constructor
	Circle()
	{
		x=0.0;y=0.0;r=1.0;
	}
	
	double circumference()
	{
		return 2*3.14159*r;
	}
	double area()
	{
		return 3.14159*r*r;
	}
}

class CircleDemo3{
	public static void main(String args[])
	{
		Circle c1 = new Circle(1.0,1.0,5.0);
		Circle c2 = new Circle(4.0);
		Circle c3 = new Circle(c1);
		Circle c4 = new Circle ();
		
		System.out.println("Circumference of first Circle: "+c1.circumference());
		System.out.println("Area of first Circle: "+c1.area());
		System.out.println("Circumference of Second Circle: "+c2.circumference());
		System.out.println("Area of Second Circle: "+c2.area());
		System.out.println("Circumference of third Circle: "+c3.circumference());
		System.out.println("Area of third Circle: "+c3.area());
		System.out.println("Circumference of forth Circle: "+c4.circumference());
		System.out.println("Area of forth Circle: "+c4.area());
	}
}