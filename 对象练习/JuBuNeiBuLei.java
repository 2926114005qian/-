class Demo
{
	int num=10;
	public void show()
	{
		final int x=5;
		class Demo1
		{
			void show1()
			{
				System.out.println("�ֲ��ڲ���"+num+".."+x);
			}
		}
		Demo1 p =new Demo1();
		p.show1();
	}
}

class JuBuNeiBuLei 
{
	public static void main(String[] args) 
	{
		Demo p=new Demo();
		p.show();
	}
}
