//Multiple class in one program
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
}

class Box{
	double width,height,depth;
	double area()
	{
		double a;
		a=(width*height+height*depth+depth*width)*2;
		return a;
	}
	double volume()
	{
		double v;
		v=width*height*depth;
		return v;
	}
}

class MulticlassDemo{
	public static void main(String args[])
	{
		Circle c = new Circle();
		Box b = new Box();
		
		c.x=3.0;c.y=4.0;c.r=10.0;
		b.width=3.0;b.height=4.0;b.depth=10.0;
		
		System.out.println("Circumference of Circle: "+c.circumference());
		System.out.println("Area of Circle: "+c.area());
		System.out.println("Area of Box: "+b.area());
		System.out.println("Volume of Box: "+b.volume());
	}
}