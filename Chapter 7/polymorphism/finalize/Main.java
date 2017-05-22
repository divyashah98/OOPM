class Demo
{
public void display(int x)
{
System.out.println("x="+x);
}

protected void finalize()
{
System.out.println("in finalize method of class demo");
}

}

class Main
{
public static void main(String args[])
{
Demo d=new Demo();
d.display(10);
d=null;
System.gc();
}
}



