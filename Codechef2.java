import java.util.*;
class Codechef2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>=0||n<=1000)       // constraints
{
if(n%4==0)
System.out.println(++n);
else
System.out.println(--n);
}
}
}
--------------------------------------------------
OUTPUT:
C:\susi>javac Codechef2.java

C:\susi>java Codechef2
5
4

C:\susi>javac Codechef2.java

C:\susi>java Codechef2
8
9
