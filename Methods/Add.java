import java.util.*;
class Add
{
public static void main(String args[])
{
int a,b,sum;
System.out.println("enter two numbers ");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
System.out.println("sum is "+sum(a,b));
}

static int sum(int x,int y)
{
return(x+y);
}

}
