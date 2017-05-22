/* sum of first n natural numbers */



import java.util.*;
class Sumrec
{
public static void main(String args[])
{
int n;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("sum= "+sum(n));
}

static int sum(int x)
{
int sum;
if(x==1)
{
System.out.println("returned value is 1");
return 1;
}
else
{
sum=x+sum(x-1);
System.out.println("returned value is "+sum);
return sum;
}

}

}
