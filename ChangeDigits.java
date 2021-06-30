import java.util.*;
public class ChangeDigits
{
public static void main(String args[])
{
int n,a,b,r,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
a=sc.nextInt();  //the digit which we want to replace
b=sc.nextInt();  //b is used to replace a
while(n>0)
{
r=n%10;
if(r==a)
rev=rev*10+b;
else
rev=rev*10+r;
n=n/10;
}
r=0;
while(rev>0)
{
r=rev%10;
n=n*10+r;
rev/=10;
}
System.out.println(n);
}
}
---------------------------------------------------------------
  output1:
enter the number
1234
4
5
1235 //here the digit 4 is replaced with 5
output2:
enter the number
16719
1
8
86789
