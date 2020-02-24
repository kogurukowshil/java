public class Stacktrace{
public static void main(String[] s)
{
try
{
 y();
}catch(Exception e)
{
 e.printStacktrace();
}
}
static void y()
{
z();
}
static void z()
{
int p=45/0;
}
}