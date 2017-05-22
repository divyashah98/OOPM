import java.util.*;
class Isarm
{
public static void main(String args[])
{
int n,r,temp,sum=0;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(temp!=0)
{
r=temp%10;
sum=sum+(r*r*r);
temp/=10;
}

if(sum==n)
System.out.println("number is armstrong");
else
System.out.println("number is not armstrong");
}
}
