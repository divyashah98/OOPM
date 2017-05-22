/*program for sequential search */

import java.util.*;
class Search
{
public static void main(String args[])
{
int n,s,i;
int a[]=new int[50];
System.out.println("enter number of elements");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("enter value of elements");
for(i=1;i<=n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter number to be searched");
s=sc.nextInt();

for(i=1;i<=n+1;i++)
{
if(a[i]==s)
break;
}
if(i==n+1)
System.out.println("number not found");
else
System.out.println("index of searched number is "+i);
}
}


