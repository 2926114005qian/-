class Person
{
	private int age;//封装数据
	private String name;
	Person(String name)//构造函数进行初始化
	{
		this.name=name;
	}
	Person(String name,int age)
	{
		this(name);
		this.age=age;
	}
	public boolean compare(Person p)//this的应用
	{
		return this.age==p.age;
	}
}


public class ThisYinYong 
{
	public static void main(String[] args) 
	{
		Person p1=new Person("aa",30);//new对象
		Person p2=new Person("zz",15);
		boolean a=p1.compare(p2);
		System.out.println(a);
	}
}
