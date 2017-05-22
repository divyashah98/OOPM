import java.util.*;
class Findarm
{
public static void main(String args[])
{
int i;
System.out.println("armstrong number between 0 to 999 are ");

for(i=0;i<=999;i++)
{
arm(i);
}

}


static void arm(int x)

{
int r,sum=0,temp;
temp=x;
while(temp!=0)
{
r=temp%10;
sum=sum+(r*r*r);
temp/=10;
}

if(sum==x)
System.out.println(x);
}

}
