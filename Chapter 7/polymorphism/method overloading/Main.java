class Area
{
public float area(float r)
{
return (3.14f*r*r);
}

public float area(float l,float b)
{
return (l*b);
}

public float area(float a,float b,float c)
{
float s;
s=(a+b+c)/2;
s=s*(s-a)*(s-b)*(s-c);
return(float)(Math.sqrt(s));
}

}


class Main
{
public static void main(String args[])
{

Area a=new Area();

System.out.println("area of circlei="+a.area(10));
System.out.println("area of circlei="+a.area(10,10));
System.out.println("area of circlei="+a.area(10,10,10));

}
}
