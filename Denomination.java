import java.util.*;
class Denomination
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int rs,c=0;
System.out.println("enter rupees");
rs=sc.nextInt();
int a[]=new int[11];
int m[]={2000,1000,500,200,100,50,20,10,5,2,1};
for(int i=0;i<11;i++)
{
if(rs>=m[i])
a[i]=rs/m[i];
rs=rs-m[i]*a[i];
}
for(int i=0;i<11;i++)
{
if(a[i]!=0)
{ 
c+=a[i];
System.out.println(m[i]+"  : "+a[i]);
}
}
System.out.println("Minimum number of notes required : "+c);
}
}
/*------------------------------------------------------------------------------------
OUTPUT:
C:\susi>java Denomination
enter rupees
800
500  : 1
200  : 1
100  : 1
Minimum number of notes required : 3
OUTPUT:
C:\susi>java Denomination
enter rupees
2456
2000  : 1
200  : 2
50  : 1
5  : 1
1  : 1
Minimum number of notes required : 6

