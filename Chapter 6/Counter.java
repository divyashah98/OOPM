import java.util.*;
class Count
{
private static int count;
Count()
{
count++;
}
static void display()
{
System.out.println("Count="+count);
}
}

class Counter
{
public static void main(String args[])
{
Count c1=new Count();
Count.display();
Count c2=new Count();
Count c3=new Count();
Count c4=new Count();
Count.display();
}
}
