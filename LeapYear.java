import java.util.*;
class LeapYear
{
public static void main(String ar[])
{

int year;
Scanner sc=new Scanner(System.in);
System.out.println("enter year");
year=sc.nextInt();
if(((year%400==0)&&(year%100==0))||(year%4==0))
System.out.println("leap year");
else
System.out.println("not a leap year");
}
}
