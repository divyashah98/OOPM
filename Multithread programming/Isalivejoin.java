class A extends Thread
{
public void run()
{
int i;
for(i=1;i<=2;i++)
{
System.out.println("in class A");

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


class B extends Thread
{
public void run()
{
int i;
for(i=1;i<=2;i++)
{
System.out.println("in class B");

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




class C extends Thread
{
public void run()
{
int i;
for(i=1;i<=2;i++)
{
System.out.println("in class C");

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






class Isalivejoin
{
public static void main(String args[])
{
A a=new A();
Thread t1=new Thread(a);
B b=new B();
Thread t2=new Thread(b);
C c=new C();
Thread t3=new Thread(c);

t1.start();
t2.start();
t3.start();

System.out.println("Thread t1 is alive "+t1.isAlive());
System.out.println("Thread t2 is alive "+t2.isAlive());
System.out.println("Thread t3 is alive "+t3.isAlive());


try
{
t1.join();
t2.join();
t3.join();
}

catch(InterruptedException e)
{
}

System.out.println("Thread t1 is alive "+t1.isAlive());
System.out.println("Thread t2 is alive "+t2.isAlive());
System.out.println("Thread t3 is alive "+t3.isAlive());


}
}
