class Alphabets extends Thread
{
public void run()
{
int i;
for(i=1;i<=5;i++)
{
System.out.println((char)(i+64));

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


class Numbers extends Thread
{
public void run()
{
int i;

for(i=1;i<=5;i++)
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




class Alphanum2
{
public static void main(String args[])
{

Alphabets a=new Alphabets();
Thread t1=new Thread(a);
Numbers n=new Numbers();
Thread t2=new Thread(n);
t1.start();
t2.start();

System.out.println("Thread t1 is alive:"+t1.isAlive());
System.out.println("thread t2 is alive:"+t2.isAlive());


try
{
t1.join();
t2.join();
}

catch(InterruptedException e)
{
}

System.out.println("Thread t1 is alive:"+t1.isAlive());
System.out.println("thread t2 is alive:"+t2.isAlive());




}
}
