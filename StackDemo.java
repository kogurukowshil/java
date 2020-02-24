import java.util.*;
public StackDemo
{
public static void main(String[]args)
{
Stack s=new Stack();
s.push("kowshil");
s.push("kowshi");
s.push("kows");
s.push("kow");
s.push("ko");
System.out.println("stack elements:"+s);
System.out.println("first elements:"+s.peek());
System.out.println("stack elements:"+s);
System.out.println("popping elements:"+s.pop());
System.out.println("stack elements:"+s);
s.push("java");
System.out.println("after adding:"+s);
System.out.println("popping out"+s.pop());
System.out.println("stack elements:"+s);
System.out.println("first element:"+s.peek()):

Enumeration e=s.elements();
System.out.println("elements are:");
while(e.hasMoreElements()){
System.out.println(e.nextElement());
}
}
}


