public class MyExplicitThrow{
public static void main(String a[])
{
try
{
MyExplicitThrow met=new MyExplicitThrow();
System.out.println("length of junk is"+met.getStringSize("junk"));
System.out.println("length of wrong is"+met.getStringSize("wrong"));
System.out.println("length of null is"+met.getStringSize(null));
}
catch(Exception ex)
{
System.out.println("exception message:"+ex.getMessage());
}
}
 public int getStringSize(String str)throwsException
{
 if(str==null)
{
throw new Exception("null is passed");
}
return str.length();
}
} 


