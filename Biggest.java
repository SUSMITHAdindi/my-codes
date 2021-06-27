import java.util.*;
class Biggest
{
public static void main(String args[])
{
int a,b,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("enter 4 numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
int e=a>b?a:b;
int f=c>d?c:d;
if(e>f)
System.out.println("Biggest number is :"+e);
else
System.out.println("Biggest number is :"+f);
}
}

