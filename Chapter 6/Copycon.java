import java.util.*;
class Circle
{
private float r,a;

Circle()
{
System.out.println("enter radius ");
Scanner sc=new Scanner(System.in);
r=sc.nextFloat();
}

Circle(Circle x)
{
r=x.r;
}

void calculate()
{
a=3.14f*r*r;
}

void display()
{
System.out.println("area is "+a);
}

}


class Copycon
{
public static void main(String args[])
{
Circle c=new Circle();
c.calculate();
c.display();


Circle c1=new Circle(c);
c1.calculate();
c1.display();
}
}

