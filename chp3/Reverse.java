import java.util.*;
class Reverse
{
public static void main(String args[])
{
int n,rem,rev=0;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
rem=n%10;
rev=(rev*10)+rem;
n/=10;
}
System.out.println("reversed number is"+rev);
}

}
