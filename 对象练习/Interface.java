//玩一下接口：抽象类里全是抽象方法时此类就为接口，
//接口用interface定义 类与接口之间的关系是实现关键字为implements
//类与接口可以实现多实现，类可以继承一个抽象实现多个接口
//接口与接口之间为继承 并且可以多继承。
interface InterfaceDemo1
{
	public abstract void show1();
}
interface InterfaceDemo2
{
	public abstract void show2();
}
interface InterfaceDemo3
{
	public abstract void show3();
}
abstract class Demo
{
	public void show4()
	{
		System.out.println("Hello World!4");
	}
	public abstract void show();
}
class MoBan extends Demo implements InterfaceDemo1,InterfaceDemo2,InterfaceDemo3
{
	public void show()
	{
		System.out.println("Hello World!");
	}
	public void show1()
	{
		System.out.println("Hello World!1");
	}
	public void show2()
	{
		System.out.println("Hello World!2");
	}
	public void show3()
	{
		System.out.println("Hello World!3");
	}
}
public class Interface 
{
	public static void main(String[] args) 
	{
		MoBan p=new MoBan();
		p.show();
		p.show1();
		p.show2();
		p.show3();
		p.show4();
	}
}
