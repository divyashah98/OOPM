class Parent
{
public void display(int x)
{
System.out.println("x="+x);
}
}

class Child extends Parent
{
public void main(int y)
{
System.out.println("y="+y);
}
}

class Main
{
public static void main(String args[])
{
Child c=new Child();
Parent p=new Parent();
Parent ref;
ref=c;
ref.display(5);
ref=p;
ref.display(10);
}
}
