import java.util.*;
class Powerec
{
public static void main(String args[])
{
int n,p;
System.out.println("enter a number and power ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
p=sc.nextInt();
System.out.println("result is "+pow(n,p));
}

static int pow(int x,int pow)
{
int res;

if(pow==1)
{
System.out.println("returned value is "+x);
return x;
}

else
{
res=x*pow(x,pow-1);
System.out.println("returned value is "+res);
return res;
}

}

}
