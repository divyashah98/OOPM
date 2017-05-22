import java.util.*;
class Fibo
{
public static void main(String args[])
{
int n,i;
int a[]=new int[50];
System.out.println("enter value of n");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
a[1]=0;
a[2]=1;
for(i=3;i<=n;i++)
{
a[i]=a[i-1]+a[i-2];
}

System.out.println("fibonacci series is");

for(i=1;i<=n;i++)
{
System.out.println(a[i]);
}

}
}
