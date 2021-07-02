//taking input n and printing sxs pattern and the pattern contain 1 to sxs elements
import java.util.*;
class Codechef1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[][]=new int[n][n];
int s=1;
int s1=n*n;
int i=0,j=0;
a[i][j]=s;
for(i=0;i<n-1;i++)
{
int c=0;
for(j=i+1;j>=0;)
{
a[c][j]=++s;
c++;
j--;
}
}
a[n-1][n-1]=s1;
int d=n-2;
for( i=1;i<=n-2;i++)
{
int c=n-1;
for( j=d;j<=n-1;)
{
a[c][j]=--s1;
c--;
++j;
}
--d;
}
for( i=0;i<n;i++)
{
for( j=0;j<n;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
}
}
---------------------------------------------------------
OUTPUT:

C:\susi>javac Codechef1.java

C:\susi>java Codechef1
4
1 2 4 7
3 5 8 11
6 9 12 14
10 13 15 16

C:\susi>javac Codechef1.java

C:\susi>java Codechef1
5
1 2 4 7 11
3 5 8 12 16
6 9 13 17 20
10 14 18 21 23
15 19 22 24 25