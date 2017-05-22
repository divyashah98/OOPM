import java.util.*;
class Factorial
{
public static void main(String args[])
{
int i,n,f=1;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
f=f*i;

}
System.out.println("factorial is "+f);
}
}
