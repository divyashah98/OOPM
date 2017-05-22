import java.io.*;

class Divide2
{
public static void main(String args[]) 
{
int a=0,b=0,res;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.println("enter two numbers:");

try
{
str=br.readLine();
a=Integer.parseInt(str);
str=br.readLine();
b=Integer.parseInt(str);
res=a/b;
System.out.println("invalid exception");
}

catch(NumberFormatException ne)
{
System.out.println("invalid number");
}


catch(IOException ioe)
{
System.out.println("io exception has occured");
}



catch(ArithmeticException ae)
{
System.out.println("exception has occured. you have entered the divisor as zero ");
}


}
}
