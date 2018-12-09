class Demo extends Thread
{
	private String name;
	public Demo(String name)
	{
		super(name);
		this.name=name;
	}
	public void run()
	{
		for (int x=0;x<5 ;x++ )
		{
			System.out.println(name+"....."+getName());
		}
			
	}
}
class DuoXianCheng 
{
	public static void main(String[] args) 
	{
		Demo c1 =new Demo("张三");
		Demo c2 =new Demo("李四");
		c1.start();
		c2.start();
		for (int x=0;x<5 ;x++ )
		{
			System.out.println("主函数"+Thread.currentThread().getName());
		}

	}
}
