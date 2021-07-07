import java.util.*;
class MajorityElement
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	int c=1,c1=0,m=0;
	int n1=n;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;)          //majority element is the element which occurs more than n/2 times
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
		if(c>n1/2)
		{
		c1=c;
		m=i;
		break;
		}
                c=1;
		
	}
	if(c1==0)
	System.out.println("there is no majority element");
	else
        System.out.println(a[m]+" is the majority element");
	}
}
------------------------------------------------------------------------------------------
C:\susi>javac MajorityElement.java

C:\susi>java MajorityElement
3
3 2 3
3 is the majority element

C:\susi>java MajorityElement
7
1 2 1 2 2 2 1
2 is the majority element

C:\susi>java MajorityElement
4
1 2 4 4
there is no majority element	
