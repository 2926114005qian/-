class Outer
{
	static class Inner
	{
		static void show()
		{
			System.out.println("�ڲ��������");
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
//		Outer out=new Outer();//�ⲿ���ӷ����ڲ���
//		out.method();
//		Outer.Inner a =new Outer().new Inner();//ֱ�ӷ����ڲ���
//		a.show();
//		Outer,Inner a=new Outer.Inner();//���ڲ����Ǿ�̬�� �൱��һ���ⲿ��
//		a.show();
		Outer.Inner.show();/*���ڲ������о�̬��Ա ����ڲ������Ϊ��̬�� 
							 ��ʱ�����ڲ����Աʱ����������ֱ�ӵ���*/
	}
}
