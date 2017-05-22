import java.util.*;
class Cbv
{
int a,b;

public static void main(String args[])
{
System.out.println("enter two numbers");
Cbv m=new Cbv();
Scanner sc=new Scanner(System.in);
m.a=sc.nextInt();
m.b=sc.nextInt();
System.out.println("numbers are a="+m.a+"\tb="+m.b);
swap(m.a,m.b);
System.out.println("after returning from method numbers are a="+m.a+"\tm.b="+m.b);
}

static void swap(int a,int b)
{
int temp;
temp=a;
a=b;
b=temp;
System.out.println("after swapping in method a="+a+"\tb="+b);
}

}
