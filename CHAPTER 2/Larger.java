import java.util.*;
 class Larger
{
public static void main(String args[])
{
int a,b,l;
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers");
a=sc.nextInt();
b=sc.nextInt();
l=(a>b)?a:b;
System.out.println("larger number is"+l);
}
}

