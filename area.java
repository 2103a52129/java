class Area
{
	void area(float r)
	{
		System .out.println("Area of circle "+(3.14*r*r));
	}
	void area(int r)
	{
		System .out.println("Area of square "+(r*r));
	}
	void area(int l,int b)
	{
		System .out.println("Area of Rectangle "+(l*b));
	}
	void area(float bh,int h)
	{
		System .out.println("Area of Triangle "+(0.5*bh*h));
	}
}

class Mainarea
{
	public static void main(String args[])
	{
		Area obj = new Area();
		obj.area(10.5);
		obj.area(10);
		obj.area(10,20);
		obj.area(10.5,20);
		
	}
}

