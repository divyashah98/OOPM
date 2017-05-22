import java.io.*;

class Divide2
{
public static void main(String args[]) throws IOException
{
int a=0,b=0,res;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.println("enter two numbers:");


str=br.readLine();
a=Integer.parseInt(str);
str=br.readLine();
b=Integer.parseInt(str);

try
{
res=a/b;

}
catch(ArithmeticException ae)
{
System.out.println("exception has occured. you have entered the divisor as zero ");
}


finally
{
System.out.println("in finally block");
}




}
}
