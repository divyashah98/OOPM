import java.util.*;
class Eucalgo
{
public int algo(int a,int b)
{
int r;
r=a%b;
while(r!=0)
{
a=b;
b=r;
r=a%b;
}
return b;
}
}

class Euclid
{
public static void main(String args[])
{
int x,y;
System.out.println("enter two numbers");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();
Eucalgo a=new Eucalgo();
System.out.println("Gcd of two numbers is "+a.algo(x,y));
}
}


