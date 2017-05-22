import java.util.*;
class Data
{
protected float r;
public void read(float a)
{
r=a;
}

}


class Area extends Data
{

private float area;

public void calculate()
{
area=3.14f*r*r;
}

public void display()
{

System.out.println("area="+area);

}


}


class Circle
{
public static void main(String args[])
{
float x;
Scanner sc=new Scanner(System.in);
System.out.println("enter a radius ");
x=sc.nextInt();
Area a=new Area();
a.read(x);
a.calculate();
a.display();
}
}
