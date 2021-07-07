//program to print prime numbers in the array
import java.util.*;
class PrimeArray
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	int c=0;
        for(int i=0;i<n;i++)
	{
		if(a[i]>1)
		{
		 c=0;
		for(int j=2;j<=a[i]/2;j++)
		{
		if(a[i]%j==0)
        	c=-1;
		}
		if(c==0)
        	System.out.print(a[i]+" ");
		
		}
	}
	if(c==-1)
        {
	System.out.println("there are no prime numbers in the array");
        }
	}
}
---------------------------------------------------------------------------------
OUTPUT:
C:\susi>java PrimeArray
5
1 2 3 4 5
2 3 5              //these are the prime number in the array
C:\susi>java PrimeArray
5
1 4 6 8 0
there are no prime numbers in the array