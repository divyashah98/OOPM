import java.util.*;
class Chararray
{
public static void main(String args[])
{
String str;
int n,i;
System.out.println("enter a string");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
n=str.length();
char c[]=new char[n];
c=str.toCharArray();
for(i=0;i<=n-1;i++)
{
System.out.println(i+"\t"+c[i]);
}
}
}
