import java.util.*;
class Titlecase
{
public static void main(String args[])
{
String str,s1,s2;
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
str=sc.nextLine();
str=str.toLowerCase();
s1=str.substring(1);
str=str.substring(0,1);
str=str.toUpperCase();
str=str.concat(s1);
n=str.length();
for(i=0;i<n;i++)
{
if(str.charAt(i)==' ')
{
s1=str.substring(0,i+1);
s2=str.substring(i+2);
str=str.substring(i+1,i+2);
str=str.toUpperCase();
str=s1.concat(str);
str=str.concat(s2);
}
}
System.out.println(str);
}
}
