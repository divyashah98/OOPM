import java.util.*;




class Pat2
{
public static void main(String args[])
{
int i,j,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of lines ");
n=sc.nextInt();

for(i=1;i<=n;i++)
{



for(j=1;j<=n-i;j++)
{
System.out.println("");
}



for(j=1;j<=i;j++)
{
System.out.print("*");
System.out.print("\t");
}
System.out.print("\n");
}


}
}

