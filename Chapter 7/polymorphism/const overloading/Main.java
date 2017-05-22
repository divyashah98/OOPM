class Rectangle
{
private int l,b;

public Rectangle()
{
l=b=10;
}

public Rectangle(int x)
{
l=b=x;
}

public Rectangle(int x,int y)
{
l=x;
b=y;
}

public void area()
{
System.out.println("area of rectangle is "+(l*b));
}

}


class Main
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle(5);
Rectangle r3=new Rectangle(3,5);
r1.area();
r2.area();
r3.area();
}
}















