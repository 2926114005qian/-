//单例设计模式
//饿汉式
class Demo
{
	private static Demo s=new Demo();
	private Demo(){}
	public static Demo getInstance()
	{
		return s;
	}
	private  int num;
	public  void setNum(int a)
	{
		num=a;
	}
	public  int getNum()
	{
		return num;
	}

}
//懒汉式
class Demo2
{
	private static Demo2 s=null;
	private Demo2(){}
	public static Demo2 getInstance()
	{
		if(s==null)
			s=new Demo2();
		return s;
	}
	private  int num;
	public  void setNum(int a)
	{
		num=a;
	}
	public  int getNum()
	{
		return num;
	}

}
public class  DanLi
{
	public static void main(String[] args) 
	{
		Demo s1=Demo.getInstance();
	}
}
