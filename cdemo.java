import java.util.*;
class circle
{
	double rad;
	void area()
	{
	double a;
	a=3.14*rad*rad;
	System.out.println("AREA"+a);
	}
	void circum()
	{
	double c;
	c=2*3.14*rad;
	System.out.println("CIRCUMFERENCE"+c);
	}
}
class cdemo
{
public static void main(String args[])
{
	circle ob=new circle();
	double r;
	Scanner x=new Scanner(System.in);
	System.out.println("Enter radius");
	r=x.nextDouble();
	ob.rad=r;
	ob.area();
	ob.circum();
}
}