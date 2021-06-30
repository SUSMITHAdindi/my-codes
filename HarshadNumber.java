import java.util.*;
import java.io.*;
public class HarshadNumber
{
public static void main(String args[])
{
int n,r,s=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int num=n;
while(n>0)
{
r=n%10;
s+=r;
n/=10;
}
if(num%s==0)
System.out.println(num+" is a harshad number");
else
System.out.println(num+" is a not harshad number");
}
}
------------------------------------------------------------------------
  output:
156
156 is a harshad number
22
22 is a not harshad number
