import java.util.*;
class Compare
{
private int x;

Compare(int a)
{
x=a;
}

Compare compare(Compare c)
{
if(x>c.x)
return this;
else
return c;
}

void display()
{
System.out.println("x="+x);
}

}


class This
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter a no ");
a=sc.nextInt();
Compare c1=new Compare(a);
System.out.println("enter another  no ");
a=sc.nextInt();
Compare c2=new Compare(a);
Compare c3;
c3=c1.compare(c2);
c3.display();
}
}
