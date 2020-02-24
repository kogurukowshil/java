import java.util.*;
class Odd
{
public static void main(String[]args)
{
int n,r,sum=0;
System.out.println("Enter the range of odd number");
Scanner s=new Scanner(System.in);
r=Integer.parseInt(s.nextLine());
for(int i=0;i<=r;i++)
{
 if(i%2!=0)
{
System.out.println(i);
  sum=sum+i;
}
}
System.out.println("total sum of integers is"+sum);
}
}
