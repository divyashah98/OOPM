import java.util.*;
class Vowels
{
public static void main(String args[])
{
String str ;
int n,i,countv=0,counts=0,countd=0,countc=0;
System.out.println("enter a string");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
n=str.length();
char c[]=new char[n];
c=str.toCharArray();
for(i=0;i<=n-1;i++)
{
if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U')
countv++;
else if(c[i]==' ')
counts++;
else if(c[i]>='0' && c[i]<='9')
countd++;
else if(c[i]>='a' && c[i]<='z' || c[i]>='A' && c[i]<='Z')
countc++;
}

System.out.println(countv+" vowels\n"+counts+" spaces\n"+countd+" digits\n"+countc+" consonants");
}
}
