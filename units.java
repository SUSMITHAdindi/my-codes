import java.util.*;
class Electricity
{
public static void main(String args[])
{
int un;
double rs;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of units");
un=sc.nextInt();
if(un>=101&&un<=200)
rs=un*5.63;
else if(un>=1&&un<=100)
rs=un*3.25;
else if(un>=201&&un<=300)
rs=un*6.88;
else if(un>=301&&un<=400)
rs=un*7.38;
else if(un>=401&&un<=500)
rs=un*7.88;
else
rs=un*8.38;
System.out.println("Electricity bill is : "+rs);
}
}
/*--------------------------------------------------------------------------------------
C:\susi>java Electricity
enter number of units
200
Electricity bill is : 1126.0
--------------------------------------------------------------------------------------*/