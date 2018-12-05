interface Fu
{
	public abstract void show();
}
class Demo2 
{
//	int num=10;
	public void show1(Fu a)
	{
//		final int x=5;
		/*new Fu()
		{
			public void show()
			{
				System.out.println("局部内部类"+num+".."+x);
			}
		}.show();*/
		a.show();

	}
}
class NiMingNeiBuLei 
{
	public static void main(String[] args) 
	{
		Demo2 p=new Demo2();
		p.show1(new Fu()
		{
			public void show()
			{
				int num=10;
				final int x=5;
				System.out.println("局部内部类"+num+".."+x);
			}
		});
	}
	
}
