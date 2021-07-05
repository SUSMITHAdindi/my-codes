import java.util.*;
class OddArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
			for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
			for(int i=0;i<n-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
					}
				}
			}
		System.out.println("Odd elements in the array in ascending order:");
			for(int i=0;i<n;i++)
			{
			if(a[i]%2==1)
			System.out.print(a[i]+" ");
			}
	}
}
-----------------------------------------------------------------------------------
OUTPUT:
C:\susi>javac OddArray.java

C:\susi>java OddArray
8
2 3 7 1 4 23 9 8
Odd elements in the array in ascending order:
1 3 7 9 23
