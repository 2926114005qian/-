class HanShu 
{
	public static void main(String[] args) 
	{
		/*
			��ϰ����ȡһ��ʮ��ʮ�����ĺ͡�
			˼·��
			1���μ�ÿ���������ֵ��ȷ����
			2��ÿ�κ�����Ҳ��ȷ����
			3��ÿ�ζ��Ǽӷ����㡣
			4�����������������
		*/
		draw(3,4);
		printCFB();
		System.out.println(equals(4,4));
		System.out.println(getMax(2,3));
		System.out.println(getLeve1(86));
		for (int x=1 ;x<=5;x++)
		{
			for (int y=1;y<x;y++ )
			{
				System.out.print(" ");
			}
			for (int y=x;y<=5 ;y++ )
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		/*int c = add(3,4);
		System.out.println(c);*/
	}
	/*public static int add(int a,int b)
	{
		return a+b;
	}*/
	/*���󣻶���һ�����ܣ���һ�������ڿ���̨��
	��ȷһ��������ܵĽ����ʲô
	û�н����û�з���ֵ�������ߡ�
	��ȷ�����������ʵ�ֹ������Ƿ���δ֪���ݲ������㡣
	�У����ε��к��в�ȷ��
	*/
	public static void draw(int row,int col)
	{
		for (int x=1;x<=row ;x++ )
		{
			for (int y=1;y<=col ;y++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		return ;
	}
	/*���󣻶���һ�����ܣ��Ƚ��������Ƿ���ȡ�
	��ȷһ��������ܵĽ����ʲô
	�� ����ֵΪboolean��
	��ȷ�����������ʵ�ֹ������Ƿ���δ֪���ݲ������㡣
	�� ��������
	*/
	
	public static boolean equals(int x,int y)
	{
		return (x==y);
	}
	/*���󣻶���һ�����ܣ���ȡ���������нϴ���Ǹ�����
	��ȷһ��������ܵĽ����ʲô
	�� ����ֵΪint��
	��ȷ�����������ʵ�ֹ������Ƿ���δ֪���ݲ������㡣
	�� ����������
	*/
	public static int getMax(int x,int y)
	{
		return x>y?x:y;
	}
	/*��ӡ�žų˷���
	  û�з���ֵ
	  �в��� ������������
	*/
	public static void printCFB()
	{
		printCFB(9);
	}
	public static void printCFB(int num)
	{
		for (int x=1;x<=num ;x++ )
		{
			for (int y=1;y<=x ;y++ )
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
		return ;
	}
	/*
		���ݷ�����ӡ�ȼ�
		�н�� char
		�в��� int
	*/
	public static char getLeve1(int a)
	{
		if (a>=90&&a<=100)
			return 'A';
		if (a>=80&&a<=89)
			return 'B';
		if (a>=70&&a<=79)
			return 'C';
		if (a>=60&&a<=69)
			return 'D';
		return 'E';
	}

}
 