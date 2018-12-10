class SynFunctionDemo /*extends Thread继承的方式*/implements Runnable
{
	private /*静态方法*/static
			/*static将数据变成共享的 多个对象调用的同一个数据*/ int num =100;
	public  void run()
	{
		sale();
	}
//	Object obj =new Object();
	boolean flag = true;//创建一个boolean变量
	public  void sale()
	{
		if(flag)//进行判断 让o线程执行同步代码块
		{
			while (true)
			{
				synchronized(this.getClass())
				{
				if (num>0)
				{
					try{Thread.sleep(10);}catch (InterruptedException e){}
					System.out.println(
					Thread.currentThread().getName()+"...."+"obj"+"...."+num--);
				}
				else //让1线程执行同步函数
					break;
				}
			}
		}
		else 
			this.show();
	}
	public static/*静态函数*/ synchronized void show()//同步函数
	{
		while(true)
		{
		if (num>0)
			{
				try{Thread.sleep(10);}catch (InterruptedException e){}
				System.out.println(
				Thread.currentThread().getName()+"...."+"function"+"...."+num--);
			}
			else 
				break;
		}
	}
}
class  SynchronizedDemo
{
	public static void main(String[] args) 
	{
		SynFunctionDemo t =new SynFunctionDemo();//创建一个Runnable接口子类对象
		Thread t1=new Thread(t);//创建了四个线程对象 并传入相同的Runnable接口子类对象
		Thread t2=new Thread(t);
		t1.start();
		try{Thread.sleep(10);}catch(InterruptedException e){}//让主线程睡眠10毫秒
		t.flag=false;
		t2.start();
	}
}
