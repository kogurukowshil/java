import java.util.*;

class UserMainCode
{

static int sumofsquareofevendigits(int a)
{

int i,rem,sum=0;

while(a!=0)
{
 rem=a%10;
if(rem%2==0)
{
 sum=sum+(rem*rem);
 }a=a/10;
}

return sum;


}
}
class Main
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int a=s.nextInt();
System.out.println(UserMainCode.sumofsquareofevendigits(a));

}
}