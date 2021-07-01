import java.util.*;
public class Pattern2
{
public static void main(String args[])
{
int n,c=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<n;i++)
{

for(int j=0;j<=i;j++)
{
System.out.print((char)(65+c)+" ");
++c;
}
System.out.println();
}
}
}
------------------------------------------------------------------------
OUTPUT:
C:\susi>javac Pattern2.java

C:\susi>java Pattern2.java
6
A
B C
D E F
G H I J
K L M N O
P Q R S T U