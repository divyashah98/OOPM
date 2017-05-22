import java.util.*;
class Lcmalgo
{
public int lcm(int a,int b)
{
int lcm;
if(a>b)
lcm=a;
else
lcm=b;

while(lcm%a!=0 || lcm%b!=0)
{
lcm++;
}
return lcm;
}
}


class Lcm
{
public static void main(String args[])
{
int x,y;
System.out.println("enter two numbers");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();
Lcmalgo l=new Lcmalgo();
System.out.println("lcm is "+l.lcm(x,y));
}
}
