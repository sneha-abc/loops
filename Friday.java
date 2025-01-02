class Operators
{
static int a=4;
static int b=5;
static int c;
static void sum()
{
c=a+b;
System.out.println(c);
}
public static void sub(int a,int b)
{
	System.out.println(a-b);
}
public static void main(String[] args)
{
sum();
Operators ope = new Operators();
ope.sub(6,4);
Circle.area();
}
}
class Circle
{
	static int r=4;
	static final double constant=3.14;
	public static void area()
	{
		double a=constant*r*r;
		System.out.println(a);
		//constant=564;
		//System.out.println(constant);
		}
}