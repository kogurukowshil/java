import java.util.*;
class Array6
{
 public static void main(String[]args)
{
int i;
Scanner s=new Scanner(System.in);
System.out.println("enter the size of an array");
int c=s.nextInt();
int a[]=new int[c];
int b[]=new int[c];
System.out.println("enter the  elements in a array");
for( i=0;i<c;i++)
{
  a[i]=s.nextInt();
  b[i]=a[i];
}
System.out.println("the values of array b is");
for(i=0;i<c;i++)
System.out.println(b[i]);
}
}
