class Numbers extends Thread
{
public void run()
{
int i;
for(i=1;i<=10;i++)
{
System.out.println(i);
}
}
}

class Impth
{
public static void main(String args[])
{
Numbers n=new Numbers();
Thread t1=new Thread(n);
t1.start();
}
}
