import java.util.*;
class SBIndexes               //sum between given indexes
{
	public static void main(String args[])
     {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	System.out.println("enter left index");
	int l=sc.nextInt();
	System.out.println("enter right index");
	int r=sc.nextInt();
	int sum=0;
	if(n>0&&l<n&&l<=r&&r<n&&r>=l)
	{
		for(int i=l;i<=r;i++)
		sum+=a[i];
	}
	System.out.println(sum);
    }
}
-------------------------------------------------------------
OUTPUT1:
C:\susi>javac SBIndexes.java

C:\susi>java SBIndexes
5
1 2 10 4 6
enter left index
1
enter right index
3
16
----------------------------------------------------------------
OUTPUT2:
C:\susi>java SBIndexes
4
12 34 1 5
enter left index
0
enter right index
0
12