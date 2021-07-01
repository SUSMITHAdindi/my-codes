import java.util.*;
public class Pattern3
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<=i;j++)
System.out.print("*"+" ");
System.out.println();
}
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1-i;j++)
System.out.print("*"+" ");
System.out.println();
}
}
}
------------------------------------------------
OUTPUT:
C:\susi>javac Pattern3.java

C:\susi>java Pattern3.java
5
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*