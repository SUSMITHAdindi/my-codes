import java.util.*;
import java.lang.*;
class Automorphic
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d=(int)Math.log10(n)+1;
	int n1=n*n;
	int r=1,num=0;
		while(n1>0)
		{
		int rem=n1%10;
		num=r*rem+num;
		int d1=(int)Math.log10(num)+1;
		if(d1==d)
		break;
		n1/=10;
		r=r*10;
		}
		if(num==n)
		System.out.println("Automorphic");
		else
		System.out.println("not Automorphic");
	}
}
-------------------------------------------------------------------
OUTPUT:
C:\susi>javac Automorphic.java

C:\susi>java Automorphic
25
Automorphic

C:\susi>java Automorphic
7
not Automorphic

C:\susi>java Automorphic
76
Automorphic
