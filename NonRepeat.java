import java.util.*;
class NonRepeat
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
		for(int j=i+1;j<n;)
		{  
			if(a[i]==a[j])
			{       
                                c++;
				for(int k=j;k<n-1;k++)
				{
				a[k]=a[k+1];
				}
				n--;
			}
                      if(a[j]==a[i])
                      j=j;
                      else
                      j++;
		}
	
		if(c==0)
		System.out.print(a[i]+" ");        //we print the elements which occured only for once
		c=0;
	}
	}
}
------------------------------------------------------------------------
OUTPUT:
C:\susi>javac NonRepeat.java

C:\susi>java NonRepeat
5
4 1 2 1 2
4           //here 4 is non repeated element
C:\susi>java NonRepeat
3
2 2 1
1          //here 1 is non repeated element
C:\susi>java NonRepeat
1
1
1          //here 1 is non repeated element
