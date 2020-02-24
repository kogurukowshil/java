interface A
{
void met1();
}
interface B extends A
{
  void met2();
  void met3();
}
class x implements B
{
public void met1()
{
System.out.println("one");
}
public void met2()
{
System.out.println("two");
}
public void met3()
{
System.out.println("three");
}
void disp()
{
System.out.println("x");
}
}
class Test33
{
public static void main(String[]args)
{
 B e=new x();
  e.met1();
e.met2();
e.met3();
e.disp();
}
}
