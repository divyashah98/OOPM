class Fibo extends Thread
{
public void run()
{
int a=0,b=1,c=0;
System.out.println("fibo element ="+a);
System.out.println("fibo element ="+b);

while((a+b)<100)
{
c=b+a;
System.out.println("fibo element ="+c);

try
{
Thread.sleep(100);
}

catch(Exception e)
{
}


a=b;
b=c;

}
}
}


class Prime extends Thread
{

public void run()
{
int n=2,i;
while(n<=25)
{
i=2;
while(n%i!=0)
{
i++;
}

if(n==i)
{
System.out.println("prime no:"+n);
}
n++;


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

class Fiboprime
{
public static void main(String args[])
{
Fibo f=new Fibo();
Thread t1=new Thread(f);
Prime p=new Prime();
Thread t2=new Thread(p);
t1.start();
t2.start();
}
}

