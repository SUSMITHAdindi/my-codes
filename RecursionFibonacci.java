import java.util.*;
class RecusionFibonacci
{ 
static int n;
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
System.out.print(0+" "+1+" ");
fact(0,1);
}
static void fact(int f1,int f2)
{
int f3=f1+f2;
if(f3<=n)
{
System.out.print(f3+" ");
fact(f2,f3);
}
}
}
/*---------------------------------------------------------------------------------------------
OUTPUT:
C:\susi>java RecusionFibonacci
25
0 1 1 2 3 5 8 13 21
-----------------------------------------------------------------------------------------------*/