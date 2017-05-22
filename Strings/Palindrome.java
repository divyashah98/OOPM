import java.util.*;
class Palindrome
{
public static void main(String args[])
{
String str;
int i,n,pal=0;
System.out.println("enter a string ");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
n=str.length();
char c[]=new char[n];
c=str.toCharArray();
for(i=0;i<=n-1;i++)
{
if(c[i]==c[n-i-1])
pal++;
}
if(pal==n)
System.out.println("String is palindrome");
else
System.out.println("String is not palindrome");
}
}
