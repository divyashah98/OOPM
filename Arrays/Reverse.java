/* reversing of array into same array */

import java.util.*;
class Reverse
{
public static void main(String args[])
{
int n,i,temp;
int a[]=new int[50];
Scanner sc=new Scanner(System.in);
System.out.println("enter number of elements");
n=sc.nextInt();
System.out.println("enter value of elements");
for(i=1;i<=n;i++)
{
a[i]=sc.nextInt();
}
for(i=1;i<=n/2;i++)
{
temp=a[n-i+1];
a[n-i+1]=a[i];
a[i]=temp;
}
System.out.println("modified array is");
for(i=1;i<=n;i++)
{
System.out.println(a[i]);
}
}
}

