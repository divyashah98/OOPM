class Star extends Thread
{
public void run()
{
int i;
for(i=1;i<=7;i++)
{

System.out.print("*");

try
{
Thread.sleep(100);
}

catch(Exception e)
{
}

}
}
}


class Slash extends Thread
{
public void run()
{
int i;
for(i=1;i<=7;i++)
{

System.out.print("/");

try
{
Thread.sleep(100);
}


catch(Exception e)
{
}

}
}
}

class Stsl
{
public static void main(String args[])
{
Star n1=new Star();
Thread t1=new Thread(n1);
Slash n2=new Slash();
Thread t2=new Thread(n2);
t1.start();
t2.start();
}
}

