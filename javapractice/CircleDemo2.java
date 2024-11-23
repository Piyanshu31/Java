//Constructor program of circle
class Circle{
	double x,y;
	double r;
	
	double circumference()
	{
		return 2*3.14159*r;
	}
	
	double area()
	{
		return 3.14159*r*r;
	}
	
	//Constructor (should have same name as class) and we use this keyword in this program.
	Circle(double x,double y ,double z)
	{
		this.x=x;
		this.y=y;
		r=z;
	}
}

class CircleDemo2{
	public static void main(String args[])
	{
		//Giving value to varibles to x,y,r while defining object
		Circle c1 = new Circle(2.0,4.0,5.0);
		Circle c2 = new Circle(-3.0,5.0,7.0);
		
		System.out.println("Circumference of circle 1: "+c1.circumference());
		System.out.println("Area of circle 1: "+c1.area());
		System.out.println("Circumference of circle 2: "+c2.circumference());
		System.out.println("Area of circle 2: "+c2.area());
	}
}