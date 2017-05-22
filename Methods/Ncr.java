import java.util.*;
class Ncr
{
public static void main(String args[])
{
int n,r,ncr,npr;
System.out.println("enter values of n and r ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
r=sc.nextInt();
ncr=fact(n)/(fact(r)*fact(n-r));
System.out.println("nCr="+ncr);
npr=fact(n)/fact(n-r);
System.out.println("nPr="+npr);
}


static int fact(int x)
{
int i,fact=1;
for(i=1;i<=x;i++)
{
fact=fact*i;
}
return fact;
}

}
