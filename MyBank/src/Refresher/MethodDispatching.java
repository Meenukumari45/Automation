package Refresher;

public class MethodDispatching extends DemoC{
public static void main(String args[])
{
	
DemoA a= new DemoB();
a.callme();
DemoB b = new DemoB();
b.callme();
DemoC c= new DemoC();
c.callme();
}
}
