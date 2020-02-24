public class StaticExample
{
static
{
System.out.println("this is the first static block");
}
public  StaticExample()
{
System.out.println("this is the first constructor");
}
public static String staticString="static variable";

static{
System.out.println("this is 2nd static block"+staticString);
}

public static void main(String[]args)
{
StaticExample statEx=new StaticExample();
StaticExample.staticMethod2();
}
static
{
staticMethod();
System.out.println("this is 3rd static block");
}
public static void staticMethod(){

System.out.println("this is static method");
}
public static void staticMethod2(){

System.out.println("this is static method2");
}
}

