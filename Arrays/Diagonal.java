/* sum of diagonal elements */

import java.util.*;
class Diagonal
{
public static void main(String args[])
{
int a[][]=new int[10][10];
int i,j,m,n,sum=0;
System.out.println("enter number of rows and columns ");
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
n=sc.nextInt();
System.out.println("enter value of elements");
for(i=1;i<=m;i++)
{
for(j=1;j<=n;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("given matrix is");
for(i=1;i<=m;i++)
{
for(j=1;j<=n;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}

for(j=1;j<=n;j++)
{
sum+=a[j][j];
}

System.out.println("sum of diagonal elements of matrix is "+sum);

}
}

