class Parent
{
public Parent(int a)
{
System.out.println("constructor of parent class:"+a);
}

public void display(int x)
{
System.out.println("x="+x);
}


}


class Child extends Parent
{

public Child(int a)
{
super(a);
System.out.println("constructor of child class:"+a);
}

public void display(int y)
{
super.display(y);
System.out.println("y="+y);
}


}


class Main
{
public static void main(String args[])
{
Child c=new Child(3);
c.display(5);
}

}

