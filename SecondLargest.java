import java.util.*;
class SecondLargest
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
				if(a[i]<a[j])                     //by sorting there by we can find second largest element
				{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				}
			}
		}
		System.out.println("Second largest element is "+a[1]);
	}
}
-------------------------------------------------------------------
OUTPUT:
C:\susi>javac SecondLargest.java

C:\susi>java SecondLargest
6
12 34 4 5 67 1
Second largest element is 34
---------------------------------------------------------------------------------

//program to find second largest element with out using sorting technique 
import java.util.*;
class SecondBiggest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int max1,max2;
		max1=a[0];
		for(int i=0;i<n;i++)
		{
		if(max1<a[i])
		max1=a[i];
		}
		if(a[0]==max1)
		max2=a[1];
		else
		max2=a[0];
		for(int i=0;i<n;i++)
		{
		if(max1==a[i])
		continue;
		if(max2<a[i])
		max2=a[i];
	}
	System.out.println("Second largest element is "+max2);
}
}
---------------------------------------------------------------
OUTPUT:
C:\susi>javac SecondBiggest.java

C:\susi>java SecondBiggest
5
12 45 34 6 1
Second largest element is 34