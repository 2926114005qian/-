/*
	��Աʾ����
���󣺹�˾�г���Ա�����������ţ�нˮ���������ݡ�
��Ŀ������������������ţ�нˮ�����н��𣬹������ݡ�
�Ը�������������ݽ�ģ��

���� 
����Ա������ ���� ���� нˮ
		��Ϊ ����
���� ���� ���� ���� нˮ ����
		��Ϊ ����
����Ա�뾭������ֱ�Ӽ̳й�ϵ
���й������� ���Կ��Խ�����Ա�;�����г�ȡ
������ϵ
*/
//������Ա
abstract class Employee
{
	 private String name;
	 public String getName()
	 {
		 return name;
	 }
	 private String id;
	 public String getId()
	 {
		 return id;
	 }
	 private double pay;
	 public double getPay()
	 {
		 return pay;
	 }
	Employee(String name,String id,double pay)
	{
		this.name=name;
		this.id=id;
		this.pay=pay;
	}
	public abstract void work();
}
//��������Ա
class Programmer extends Employee
{
	Programmer(String name,String id,double pay)
	{
		super( name, id, pay);
	}
	public void work()
	{
		System.out.println("name:"+getName());
		System.out.println("id:"+getId());
		System.out.println("pay:"+getPay());
		System.out.println("code....");
	}
}
//��������
class Manager extends Employee
{
	private int bonus;
	Manager(String name,String id,double pay,int bonus)
	{
		super( name, id, pay);
		this.bonus=bonus;
	}
	public void work()
		{
			System.out.println("name:"+getName());
			System.out.println("id:"+getId());
			System.out.println("pay:"+getPay());
			System.out.println("bonus:"+bonus);
			System.out.println("manage");
		}
}
class AbstractDemo 
{
	public static void main(String[] args) 
	{
		Programmer p=new Programmer("����","25",1500.00);
		p.work();
		Manager p1=new Manager("����","25",1500.00,1000);
		p1.work();
	}
}
