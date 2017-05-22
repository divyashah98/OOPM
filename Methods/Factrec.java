import java.util.*;
class Factrec
{
public static void main(String args[])
{
int n;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("factorial of given number is "+fact(n));
}

static int fact(int x)
{
int res;

if(x==1)
{
System.out.println("returned value is 1");
return 1;
}
else
{
res=x*fact(x-1);
System.out.println("returned value is "+res);
return res;
}
}

}
