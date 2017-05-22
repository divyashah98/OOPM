import java.util.*;
class Person
{
String name;
protected int code;
}

class Account extends Person
{
protected float pay;
}

class Admin extends Account
{
private int exp;

public void accept(String s,int c,float p,int e)
{
name=s;
code=c;
pay=p;
exp=e;
}

public void display()
{
System.out.println("Name:"+name+"\nCode:"+code+"\npay:"+pay+"\nexp"+exp);
}
}

class Main
{
public static void main(String args[])
{
float pay;
int c,e;
String s1,s2;
Scanner sc=new Scanner(System.in);
System.out.println("enter name,code,pay and exp");
s1=sc.nextLine();
c=sc.nextInt();
pay=sc.nextFloat();
e=sc.nextInt();
Admin a=new Admin();
a.accept(s1,c,pay,e);
a.display();
}
}

