/*new对象时 先调用new对象的类的构造函数即子类的构造函数 此时子类通过super初始化父类的内容
此时 子类的成员变量并未初始化，等super()父类初始化完毕后，
才进行子类的成员变量初始化，再接着完成子类的构造函数初始化。*/
class Fu
{
	Fu()
	{
		super();//super();这是虚拟机默认的父类构造函数，当有继承时就会生成。
		show();
		return;
	}
	void show()
	{
		System.out.println("Fu run");
	}
}
class Zi extends Fu
{
	int num=8;
	Zi()
	{
		super();	
		System.out.println("num="+num);
		return;
	}
	void show()
	{
		System.out.println("num="+num);
	}
}
class  ZiFuGouZao
{
	public static void main(String[] args) 
	{
		new Zi();
	}
}
