import java.util.*;
class Bitwise
{
public static void main(String args[])
{
int a,b;
System.out.println("enter two numbers");
Scanner sc=new Scanner(System.in) ;
a=sc.nextInt();
b=sc.nextInt();
System.out.println("anded o/p is "+(a&b)+" or o/p is "+(a|b)+" xor o/p is "+(a^b)+" not of a "+(~a)+" not of b is"+(~b));
}
}

