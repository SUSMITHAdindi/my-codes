import java.util.*;
class Runningsum
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	int sum=0;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=i;j++)
		{
		sum+=a[j];
		}
	}
	System.out.println(sum);
	}
}
-------------------------------------------------------
OUTPUT1:
C:\susi>javac Runningsum.java

C:\susi>java Runningsum
5
1 2 3 4 5
35               //1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
-----------------------------------------------------------
OUTPUT2:
C:\susi>java Runningsum
3
1 10 5              //1+(1+10)+(1+10+5)
28