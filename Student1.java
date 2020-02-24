class Student1
{
 String name;
 Student1(String s);
{
  name=na;
}
String getName()
{
  return name;
}
}
public class Test
{
public static void main(String args[]){
Student s1[]=new Student[2];
 s1[0]=new Student("kowshil");
 s1[1]=new Student("john");
for(int i=0;i<s1.length;i++){
System.out.println("s1= "+s1.getName());
}
}
}