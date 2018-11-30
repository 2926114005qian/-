/*
	雇员示例：
需求：公司中程序员有姓名，工号，薪水，工作内容。
项目经理除了有姓名，工号，薪水，还有奖金，工作内容。
对给出需求进行数据建模。

分析 
程序员：属性 姓名 工号 薪水
		行为 工作
经理： 属性 姓名 工号 薪水 奖金
		行为 工作
程序员与经理不存在直接继承关系
但有共性内容 所以可以将程序员和经理进行抽取
建立体系
*/
//描述雇员
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
//描述程序员
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
//描述经理
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
		Programmer p=new Programmer("张三","25",1500.00);
		p.work();
		Manager p1=new Manager("李总","25",1500.00,1000);
		p1.work();
	}
}
