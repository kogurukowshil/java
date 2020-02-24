class emp
{
 final int eno=101;
void display()
{
System.out.println(eno);
}
}
class manager extends emp
{
void display()
{
System.out.println("manager class");
System.out.println(eno);
}
}
class Test11
{
public static void main(String[]args)
{
 manager f=new manager();
 f.display();
}
}