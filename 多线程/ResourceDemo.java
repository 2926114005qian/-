//共有资源
class Resource
{
	private String name;
	private String sex;
	public synchronized void set(String name,String sex)
	{
		this.name=name;
		this.sex=sex;
	}
	public synchronized void out()
	{
		System.out.println(this.name+"....."+this.sex);
	}
}
//输入进程
class Input implements Runnable
{
	Resource r;
	Input(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		int x=0;
		while (true)
		{
				if (x==0)
				{
					r.set("mike","nan");
				}
				else
				{
					r.set("丽丽","女女女");
				}
			x=(x+1)%2;
		}
	}
}
//输出进程
class Output implements Runnable
{
	Resource r;
	Output(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		while (true)
		{
			r.out();
		}
	}
}
class ResourceDemo 
{
	public static void main(String[] args) 
	{
		//创建资源 并且可以作为一把共有的锁起作用
		Resource r =new Resource();
		//创建任务
		Input in =new Input(r);
		Output out=new Output(r);
		//创建线程
		Thread t1 =new Thread(in);
		Thread t2 =new Thread(out);
		//开启线程
		t1.start();
		t2.start();
	}
}
