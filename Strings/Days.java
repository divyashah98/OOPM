import java.util.*;
class Days
{

/*
int ed,sd,sm,em,sy,ey,dc,mc,yc,total,a=12,i;
int day[]={31,28,31,30,31,30,31,31,30,31,30,31};



int days_count()
{
dc=ed-sd;
return dc;
}

int month_count()
{
int i;
for(i=sm;i<=em;i++)
mc+=day[i];
return mc;
}

int year_count()
{
if(sy==ey)
return 0;
else
yc=365*(ey-sy);
return yc;
}
*/

public static void main(String args[])
{

int ed,sd,sm,em,sy,ey,dc,mc=0,yc,total,a=12,i;
int day[]=new int[12];

day={31,28,31,30,31,30,31,31,30,31,30,31};


String str,str1;
System.out.println("enter starting date of semester (dd/mm/yyyy): ");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
str1=str.substring(0,2);
sd=Integer.parseInt(str1);
str1=str.substring(3,5);
sm=Integer.parseInt(str1);
str1=str.substring(6,10);
sy=Integer.parseInt(str1);


System.out.println("enter ending date of semester (dd/mm/yyyy): ");
str=sc.nextLine();
str1=str.substring(0,2);
ed=Integer.parseInt(str1);
str1=str.substring(3,5);
em=Integer.parseInt(str1);
str1=str.substring(6,10);
ey=Integer.parseInt(str1);


dc=ed-sd;

for(i=sm;i<=em-2;i++)
{
mc+=day[i];
}

yc=365*(ey-sy);



total=yc+mc+dc;
System.out.println("total number of dys in semester are "+total);
}
}





