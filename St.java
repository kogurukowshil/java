public class St{
   int a;
    St(){}
    void disp()
{
  a++;
System.out.println(a);
}
public static void main(String[]args)
{
for(int i=0;i<5;i++)
{
St se=new St();
se.disp();
}
}
}
