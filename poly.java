class Polympl
{
	void sum()
	{
		System .out.println("I am Default Sum");
	}
	void sum(int i)
	{
		System .out.println("Value is"+i);
	}
	void sum(int i,int j)
	{
		System .out.println("Sum is"+(i+j));
	}
	void sum(int i,int j,int k)
	{
		System .out.println("Sum is"+(i+j+k));
	}
}
class MainPoly
{
	public static void main(String args[])
	{
		Polympl obj = new Polympl();
		obj.sum();
		obj.sum(10);
		obj.sum(10,20);
		obj.sum(10,20,30);
	}
}
	
	