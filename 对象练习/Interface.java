//��һ�½ӿڣ���������ȫ�ǳ��󷽷�ʱ�����Ϊ�ӿڣ�
//�ӿ���interface���� ����ӿ�֮��Ĺ�ϵ��ʵ�ֹؼ���Ϊimplements
//����ӿڿ���ʵ�ֶ�ʵ�֣�����Լ̳�һ������ʵ�ֶ���ӿ�
//�ӿ���ӿ�֮��Ϊ�̳� ���ҿ��Զ�̳С�
interface InterfaceDemo1
{
	public abstract void show1();
}
interface InterfaceDemo2
{
	public abstract void show2();
}
interface InterfaceDemo3
{
	public abstract void show3();
}
abstract class Demo
{
	public void show4()
	{
		System.out.println("Hello World!4");
	}
	public abstract void show();
}
class MoBan extends Demo implements InterfaceDemo1,InterfaceDemo2,InterfaceDemo3
{
	public void show()
	{
		System.out.println("Hello World!");
	}
	public void show1()
	{
		System.out.println("Hello World!1");
	}
	public void show2()
	{
		System.out.println("Hello World!2");
	}
	public void show3()
	{
		System.out.println("Hello World!3");
	}
}
public class Interface 
{
	public static void main(String[] args) 
	{
		MoBan p=new MoBan();
		p.show();
		p.show1();
		p.show2();
		p.show3();
		p.show4();
	}
}
