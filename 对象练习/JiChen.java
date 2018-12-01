class Fu
{
	int num=10;
	void show()
	{
		System.out.println(num);
	}
}
class Zi extends Fu
{
	int temp=5;
	void show()
	{
		System.out.println(temp);
		super.show();
	}
}



class JiChen 
{
	public static void main(String[] args) 
	{
		Zi p=new Zi();
		p.show();
	}
}
