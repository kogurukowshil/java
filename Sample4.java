class A
{
int x=100;
A()
{
System.out.println("A");
}
}
class B extends A
{
B()
{
System.out.println("B");
}
}
class Sample4
{
public static void main(String[]args)
{
B ob=new B();
}
}
