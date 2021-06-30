import java.util.*;
class EnOprint
{
public static void main(String args[])
{
int n,r,i=0,j=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[25];
int b[]=new int[24];
while(n>0)
{
r=n%10;
if(r%2==0)
{
a[i]=r;
i++;
}
else
{
b[j]=r;
j++;
}

n=n/10;
}
System.out.print("even digits :");
for(int k=0;k<i;k++)
System.out.print(a[k]+" ");
System.out.println();
System.out.print("odd digits :");
for(int k=0;k<j;k++)
System.out.print(b[k]+" ");
}
}