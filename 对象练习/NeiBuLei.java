class Outer
{
	static class Inner
	{
		static void show()
		{
			System.out.println("内部类哈哈哈");
		}
	}
	public void method()
	{
		Inner in=new Inner();
		in.show();
	}
}
class NeiBuLei 
{
	public static void main(String[] args) 
	{
//		Outer out=new Outer();//外部类间接访问内部类
//		out.method();
//		Outer.Inner a =new Outer().new Inner();//直接访问内部类
//		a.show();
//		Outer,Inner a=new Outer.Inner();//若内部类是静态的 相当于一个外部类
//		a.show();
		Outer.Inner.show();/*若内部类中有静态成员 则此内部类必须为静态的 
							 此时调用内部类成员时可以用类名直接调用*/
	}
}
