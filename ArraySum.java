import java.util.*;
class ArraySum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		sum+=a[i];
		System.out.println("sum of all the elements in array is:"+sum);
	}
}
-------------------------------------------------------------------
OUTPUT:
C:\susi>javac ArraySum.java

C:\susi>java ArraySum
3
15 10 6
sum of all the elements in array is:31