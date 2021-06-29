import java.util.*;
public class Range
{
public static void main(String args[])
{
int n,n1;
Scanner sc=new Scanner(System.in);
System.out.println("enter upper boundary");
n=sc.nextInt();
System.out.println("enter lower boundary");
n1=sc.nextInt();
while(n>=n1)
{
if(n%2==0)
System.out.print(n+" ");
n--;
}
}
}