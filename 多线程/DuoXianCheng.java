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
		Demo c1 =new Demo("����");
		Demo c2 =new Demo("����");
		c1.start();
		c2.start();
		for (int x=0;x<5 ;x++ )
		{
			System.out.println("������"+Thread.currentThread().getName());
		}

	}
}
