import java.util.*;
public class Array
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[10];
for(int i=1;i<a.length;i++){
arr[i]=Integer.parseInt(s.nextLine(a[i]));
}
int g=a[0];
for(int i=1;i<a.length;i++)
{
 if(a[i]>g)
{
   g=a[i];
}
}
System.out.println(g);
}
}