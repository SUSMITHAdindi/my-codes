import java.util.*;
public class Pattern1
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<n-i;j++)
System.out.print("*"+" ");
System.out.println();
}
}
}
----------------------------------------------------------
OUTPUT1:
C:\susi>javac Pattern1.java

C:\susi>java Pattern1
5
* * * * *
* * * *
* * *
* *
*
OUTPUT2:
C:\susi>javac Pattern1.java

C:\susi>java Pattern1
3
* * *
* *
*