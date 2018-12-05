class Fu
{
	static int num =10;
	void show()
	{
		System.out.println("fu"+num);
	}
	static void show1()
	{
		System.out.println("fu"+num);
	}
}
class Zi extends Fu
{
	static int num =9;
	int x=10;
	void show()
	{
		System.out.println("zi"+x);
	}
	static void show1()
	{
		System.out.println("zi"+num);
	}

}


class  DuoTai
{
	public static void main(String[] args) 
	{
		Fu c = new Zi();
		c.show1();
	}
}
