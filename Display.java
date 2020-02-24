import java.util.*;
class Display
{
public static void main(String[]args)
{
 int a,last_no;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of a");
a=Integer.parseInt(s.nextLine());
last_no=a%10;
System.out.println(last_no);
switch(last_no)
{
 case 1:System.out.println("one");break;
case 2:System.out.println("two");break;
case 3:System.out.println("three");break;
case 4:System.out.println("four");break;
case 5:System.out.println("five");break;
case 6:System.out.println("six");break;
case 7:System.out.println("seven");break;
case 8:System.out.println("eight");break;
case 9:System.out.println("nine");break;
default:System.out.println("");break;
}
}
}

