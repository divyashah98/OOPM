/*finding largest & second largest number in an array*/

import java.util.*;
class Large2
{
public static void main(String args[])
{
int a[]=new int[50];
int i,n,j,temp;
System.out.println("enter number of elements");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("enter value of elements");
for(i=1;i<=n;i++)
{
a[i]=sc.nextInt();
}
for(j=1;j<=n-1;j++)
{
for(i=1;i<=n-1;i++)
{
if(a[i]>a[i+1])
{
temp=a[i];
a[i]=a[i+1];
a[i+1]=temp;
}
}
}
System.out.println("largest number is "+a[n]+" second largest number is "+a[n-1]);

}
}
