import java.util.*;
class Complex
{
private int x,y;
Complex(int a,int b)
{
x=a;
y=b;
}

void add(Complex a)
{
x=x+a.x;
y=y+a.y;
}

void display()
{
if(y>=0)
System.out.println(x+"+i"+y);
else
System.out.println(x+""+y+"i");
}
}

class Passobj
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
c1.add(c2);
c1.display();
}
}

