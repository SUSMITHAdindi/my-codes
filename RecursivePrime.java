import java.util.*;
class RecursivePrime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
if(prime(2,n))
System.out.println("Prime number");
else
System.out.println("not a prime");
}
static boolean prime(int i,int n)
{
if(n==2||i>n/2)
return true;
if(n<2)
return false;
if(i>n/2||n%i==0)
return false;
return prime(i+1,n);
}
}
/*----------------------------------------------------------------------------------------------
OUTPUT:
C:\susi>java RecursivePrime
enter a number
11
Prime number
C:\susi>java RecursivePrime
enter a number
45
not a prime
----------------------------------------------------------------------------------------------*/