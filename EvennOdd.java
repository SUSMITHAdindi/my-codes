import java.util.*;
public class EvennOdd
{
public static void main(String args[])
{
int n,rev=0,even=0,odd=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
while(n>0)
{
rev=n%10;
if(rev%2==0)
even++;
else
odd++;
n=n/10;
}
System.out.println("number of even digits in a number:"+even);
System.out.println("number of odd digits in a number:"+odd);
}
}