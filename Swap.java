import java.io.*;
class Swap
{
public static void main(String args[])
{
int a=5,b=6;
System.out.println("values of a and b before swapping are :"+a+" "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("values of a and b after swapping are :"+a+" "+b);
}
}