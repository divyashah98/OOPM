import java.util.*;
class Count
{
public static void main(String args[])
{
String str ;
int n,i,countu=0,countl=0,counts=0,countd=0;
System.out.println("enter a string");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
n=str.length();
char c[]=new char[n];
c=str.toCharArray();
for(i=0;i<=n-1;i++)
{
if(c[i]>='A' && c[i]<='Z')
countu++;
else if(c[i]>='a' && c[i]<='z')
countl++;
else if(c[i]==' ')
counts++;
else if(c[i]>='0' && c[i]<='9')
countd++;
}

System.out.println(countu+" uppercase\n"+countl+" lowerspace\n"+counts+" spaces\n"+countd+" digits");
}
}
