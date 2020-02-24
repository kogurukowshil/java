class Exception
{
public static void main(String[]args)
{
int n=10,a=0;
int c[]=new int[4];
try
{
  try
  {
   c[2]=20;
   System.out.println(c[7]);
   }
  catch(ArrayIndexOutOfBoundsException f)
   {
   System.out.println(f);
    }

   System.out.println(n/a);
}
catch(ArithmeticException e)
{
System.out.println(e);
}

System.out.println("after exception");
}
}