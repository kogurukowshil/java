import java.io.*;
public class Test7{
public static void main(String st[])throws Exception
{
String s="pw2.java";
String s1="pw1.java";
int i;
FileInputStream fis=new FileInputStream(s1);
FileOutputStream bw=new FileOutputStream(s,false);
while((i=fis.read())!=-1)
{
bw.flush();
bw.write(i);
}
bw.close();
fis.close();
}
}