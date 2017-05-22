import java.util.*;
class Addarr
{
public static void main(String args[])
{
int arr[]=new int[50];
int i,p,v,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of elements");
n=sc.nextInt();

System.out.println("enter elements of array");

for(i=1;i<=n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter position of element ");
p=sc.nextInt();
System.out.println("enter value of element ");
v=sc.nextInt();

for(i=n ;i>=p;i--)
{
arr[i+1]=arr[i];
}
arr[p]=v;
System.out.println("modified array is ");
n=n+1;
for(i=1;i<=n;i++)
{
System.out.println(arr[i]);
}
}
}
