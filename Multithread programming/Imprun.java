class Numbers implements Runnable
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

class Imprun
{
public static void main(String args[])
{
Numbers n=new Numbers();
Thread t1=new Thread(n);
t1.start();
}
}
