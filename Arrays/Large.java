/* finding largest number */

import java.util.*;
class Large
{
public static void main(String args[])
{
int i,large,n;
int a[]=new int[50];
System.out.println("enter number of element");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("enter value of element");

for(i=1;i<=n;i++)
{
a[i]=sc.nextInt();
}
large=a[0];
for(i=1;i<=n;i++)
{

if(a[i]>large)
large=a[i];
}
System.out.println("largest element is"+large);
}
}

