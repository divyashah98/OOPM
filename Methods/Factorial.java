import java.util.*;
class Factorial
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
int i,fact=1;
for(i=1;i<=x;i++)
{
fact=fact*i;
}
return fact;
}

}
