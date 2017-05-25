class Ticket extends Thread
{
int vacant=1,required;

Ticket(int x)
{
required=x;
}

public synchronized void run()
{

if(vacant>=required)

{

System.out.println(required+" tickets booked for "+Thread.currentThread().getName());

try
{
Thread.sleep(100);
}

catch(Exception e)
{
}

vacant-=required;

}

else

{
System.out.println("house full "+Thread.currentThread().getName());
}


}
}



class Movie
{
public static void main(String args[])
{
Ticket n=new Ticket(1);
Thread t1=new Thread(n);
Thread t2=new Thread(n);
t1.setName("ajay");
t2.setName("vijay");
t1.start();
t2.start();
}
}


