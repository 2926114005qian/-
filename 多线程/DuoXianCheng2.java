class Demo /*extends Thread继承的方式*/implements Runnable
{
	private /*static将数据变成共享的 多个对象调用的同一个数据*/ int num =1;
	public void run()
	{
		sale();
	}
	Object obj =new Object();
	public void sale()
	{
		while (true)
		{
			synchronized(obj)
			{
			if (num>0)
				System.out.println(Thread.currentThread().getName()+"...."+num--);
			else 
				break;
			}
		}
	}
}
class DuoXianCheng2 
{
	public static void main(String[] args) 
	{
		Demo t =new Demo();//创建一个Runnable接口子类对象
		Thread t1=new Thread(t);//创建了四个线程对象 并传入相同的Runnable接口子类对象
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		/*创建了四个线程子类对象
		Demo t1 =new Demo();
		Demo t2 =new Demo();
		Demo t3 =new Demo();
		Demo t4 =new Demo();
		*/
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
