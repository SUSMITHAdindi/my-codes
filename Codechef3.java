
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef3
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int t,n;
          Scanner sc=new Scanner(System.in);
          t=sc.nextInt();
	  while(t>0)    //this loop is for test cases
	  {
	     n=sc.nextInt(); 
	      int f=1;
	      int i=1;
	      while(i<=n)
	      {
	         f=f*i;
	         i++;
	      }
	      System.out.println(f);
              System.out.println("-----------------------");//this is used to separate each test case
	      t--;
	      
	  }
	  
	}
}
-----------------------------------------------
OUTPUT:
C:\susi>javac Codechef3.java

C:\susi>java Codechef3
4
2
2
-----------------------
3
6
-----------------------
4
24
-----------------------
5
120
-----------------------

