class Alphabets extends Thread
{
public void run()
{
int i;
for(i=1;i<=26;i++)
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

for(i=1;i<=10;i++)
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




class Alphanum
{
public static void main(String args[])
{

Alphabets a=new Alphabets();
Thread t1=new Thread(a);
Numbers n=new Numbers();
Thread t2=new Thread(n);
t1.start();
t2.start();
}
}
