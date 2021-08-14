import java.util.*;
class RecursionSum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("sum of the digits in a number : " +sum(n));
}
static int sum(int n)
{
if(n==0)
return 0;
return n%10+sum(n/10);
}
}
/*-----------------------------------------------------------------------------
Output:
C:\susi>java RecursionSum
432
sum of the digits in a number : 9
*/