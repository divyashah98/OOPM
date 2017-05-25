class Oddnumbers extends Thread
{
public void run()
{
int i;

for(i=1;i<=10;i=i+2)
{
System.out.println(i);

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

class Evennumbers extends Thread
{
public void run()
{
int i;

for(i=2;i<=10;i=i+2)
{
System.out.println(i);

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

class Oddeven
{
public static void main(String args[])
{
Oddnumbers n1=new Oddnumbers();
Thread t1=new Thread(n1);
Evennumbers n2=new Evennumbers();
Thread t2=new Thread(n2);
t1.start();
t2.start();
}
}
