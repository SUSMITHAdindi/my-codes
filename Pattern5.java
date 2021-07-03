import java.util.*;
class Pattern5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(2*i+1);j++)
			{
			System.out.print("*");
			}
			for(int l=0;l<n;l++)
			System.out.println();
		}
		for(int i=n-1;i>0;i--)
		{
			for(int j=1;j<=(2*i-1);j++)
			{
			System.out.print("*");
			}
			for(int l=0;l<n;l++)
			System.out.println();
		}
	}
}
------------------------------------------------------------------
OUTPUT:
C:\susi>javac Pattern5.java

C:\susi>java Pattern5
4
*



***



*****



*******



*****



***



*
