import java.util.*;
class Digitrec
{
public static void main(String args[])
{
int n;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("sum of digits is "+add(n));
}

static int add(int x)
{
int res;
if(x==0)
{
System.out.println("Returned value is 0");
return 0;
}
else
{
res=x%10+add(x/10);
System.out.println("Returned value is "+res);
return res;
}
}


}
