/*new����ʱ �ȵ���new�������Ĺ��캯��������Ĺ��캯�� ��ʱ����ͨ��super��ʼ�����������
��ʱ ����ĳ�Ա������δ��ʼ������super()�����ʼ����Ϻ�
�Ž�������ĳ�Ա������ʼ�����ٽ����������Ĺ��캯����ʼ����*/
class Fu
{
	Fu()
	{
		super();//super();���������Ĭ�ϵĸ��๹�캯�������м̳�ʱ�ͻ����ɡ�
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
