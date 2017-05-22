import java.util.*;
class Sentencecase
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
System.out.println(str);
}
}
