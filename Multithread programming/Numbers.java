class Num extends Thread
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


class Numbers
{
public static void main(String args[])
{
Num n1=new Num();
Thread t1=new Thread(n1);
Num n2=new Num();
Thread t2=new Thread(n2);
t1.start();
t2.start();
}
}
