//program to eliminate duplicate elements in an array
import java.util.*;
class Arr
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]==a[j])
			{
				for(int k=j;k<n-1;k++)
				{
				a[k]=a[k+1];
				}
				n--;
			}
		}
	}
	for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
	}
}
--------------------------------------------------------------
OUTPUT1:
C:\susi>javac Arr.java

C:\susi>java Arr
8
3 10 10 3 4 5 4 10
3 10 4 5
OUTPUT2:
C:\susi>java Arr
3
1 2 3
1 2 3
OUTPUT3:
C:\susi>java Arr
5
12 2 3 12 2
12 2 3