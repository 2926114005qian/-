class Person
{
	private int age;//��װ����
	private String name;
	Person(String name)//���캯�����г�ʼ��
	{
		this.name=name;
	}
	Person(String name,int age)
	{
		this(name);
		this.age=age;
	}
	public boolean compare(Person p)//this��Ӧ��
	{
		return this.age==p.age;
	}
}


public class ThisYinYong 
{
	public static void main(String[] args) 
	{
		Person p1=new Person("aa",30);//new����
		Person p2=new Person("zz",15);
		boolean a=p1.compare(p2);
		System.out.println(a);
	}
}
