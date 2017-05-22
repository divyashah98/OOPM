import java.util.*;
class Complex
{
private int x,y;
Complex(int a,int b)
{
x=a;
y=b;
}

Complex()
{
}

Complex add(Complex a)
{
Complex c=new Complex();
c.x=x+a.x;
c.y=y+a.y;
return c;
}

void display()
{
if(y>=0)
System.out.println(x+"+i"+y);
else
System.out.println(x+""+y+"i");
}
}

class Retobj
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter first complex number");
a=sc.nextInt();
b=sc.nextInt();
Complex c1=new Complex(a,b);
System.out.println("enter second complex number");
a=sc.nextInt();
b=sc.nextInt();
Complex c2=new Complex(a,b);
Complex c3=new Complex();
c3=c1.add(c2);
c3.display();

}
}

