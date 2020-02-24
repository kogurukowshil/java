class A
{
int x,y;
int get(int p,int q){
x=p;y=q;return(0);
}
void show()
{
System.out.println(x);

}
}
class B extends A
{
public static void main(String[]args)
{
B a=new B();
a.get(5,6);
a.show();

}
void show()
{
super.show();
System.out.println(y);
}
}