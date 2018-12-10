/*
等待/唤醒机制
涉及的方法
1.wait():让线程处于冻结状态，被冻结的线程处于线程池中。
2.notify():唤醒一个线程池中的随机线程。
3.notifyAll():唤醒线程池中所有线程。
*/
class Resource2
{
	private boolean flag=false;
	private String name;
	private String sex;
	public synchronized void set(String name,String sex)
	{
		if(flag)
			try{this.wait();}catch(InterruptedException e){}
		this.name=name;
		this.sex=sex;
		flag=true;
		this.notify();
	}
	public synchronized void out()
	{
		if(!flag)
			try{this.wait();}catch(InterruptedException e){}
		System.out.println(this.name+"....."+this.sex);
		flag=false;
		this.notify();
	}
} 
class Input2 implements Runnable
{
	Resource2 r;
	Input2(Resource2 r)
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
class Output2 implements Runnable
{
	Resource2 r;
	Output2(Resource2 r)
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
class ResourceDemo2
{
	public static void main(String[] args) 
	{
		//创建资源
		Resource2 r =new Resource2();
		//创建任务
		Input2 in =new Input2(r);
		Output2 out=new Output2(r);
		//创建线程
		Thread t1 =new Thread(in);
		Thread t2 =new Thread(out);
		//开启线程
		t1.start();
		t2.start();
	}
}
