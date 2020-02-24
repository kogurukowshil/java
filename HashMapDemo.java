importjava.util.*;
class HashmapDemo
{
public static void main(String arg[])
{
HashMap hm=new HashMap();
hm.put("oop","object oriented programing");

hm.put("object","has state and behaviour");
hm.put("class",defines state and behaviour share by obj");
System.out.println(hm);
Set s=hm.entrySet();
System.out.println("\n hashmap current size:"+hm.size());
System.out.println("elements of hashmap");
System.out.println();
Iterator itr=s.iterator();
while(itr.hasNext())
{
object ob=itr.next();
