import java.util.*;
class Vowel
{
public static void main(String args[])
{
int ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter an alphabet");
ch=sc.next().charAt(0);
if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
System.out.println("given alphabet is an vowel");
else
System.out.println("given alphabet is an consonant");
}
}