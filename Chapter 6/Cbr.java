import java.util.*;
class Cbr
{
int a,b;

public static void main(String args[])
{
System.out.println("enter two numbers");
Scanner sc=new Scanner(System.in);
Cbr m=new Cbr();
m.a=sc.nextInt();
m.b=sc.nextInt();
System.out.println("numbers are a="+m.a+"\tb="+m.b);
swap(m);
System.out.println("after returning from method numbers are a="+m.a+"\tb="+m.b);
}

static void swap(Cbr x)
{
int temp;
temp=x.a;
x.a=x.b;
x.b=temp;
System.out.println("after swapping in method a="+x.a+"\tb="+x.b);
}

}
