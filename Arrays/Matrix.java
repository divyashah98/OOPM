/* displaying the matrix */

import java.util.*;
class Matrix
{
public static void main(String args[])
{
int a[][]=new int[10][10];
int i,j,m,n;
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
}

}

