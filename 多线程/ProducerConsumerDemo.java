//lock接口代替synchronized(同步)
//Condition代替object的监视器方法
//synchronized的监视器方法：wait() notify() notifyAll()
//Condition的监视器方法:await() signal() signalAll()
//lock接口创建并绑定Condition对象  Condition c=lock.newCondition(); 可以有多个监视器。
import java.util.concurrent.locks.*;//导入newlock对象所需的类
class Resource
{
	private String name;
	private int count=1;
	private boolean flag =false;
//创建一个lock对象
	Lock lock = new ReentrantLock();
//在制定锁上创建两组监视器
	Condition producer_con =lock.newCondition();
	Condition comsumer_con =lock.newCondition();
	public /*synchronized*/ void setName(String name)
	{
		lock.lock();//获取锁
		try
		{
			while (flag)
			{
//				try{wait();}catch(InterruptedException e){}
				try{producer_con.await();}catch(InterruptedException e){}
			}
			this.name= name + count;
			count++;
			System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);
			flag=true;
//			notifyAll();
//			c1.signalAll();
			comsumer_con.signal();
		}
		finally//代表着释放锁的步骤必须做
		{
			lock.unlock();//释放锁
		}
		
	}
	public /*synchronized*/ void getName()
	{
		lock.lock();
		try
		{
			while (!flag)
			{
//				try{wait();}catch(InterruptedException e){}
				try{comsumer_con.await();}catch(InterruptedException e){}
			}
			System.out.println(Thread.currentThread().getName()+"...消费者....."+this.name);
			flag=false;
//			notifyAll();
//			c1.signalAll();
			producer_con.signal();
		}
		finally
		{
			lock.unlock();
		}
		
	}
}
class Producer implements Runnable
{
	private Resource r;
	Producer(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		while (true)
		{
			r.setName("烤鸭");
		}
	}
}
class Consumer implements Runnable
{
	private Resource r;
	Consumer(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		while (true)
		{
			r.getName();
		}
	}
}
class  ProducerConsumerDemo
{
	public static void main(String[] args) 
	{
		Resource r=new Resource();
		Producer pro=new Producer(r);
		Consumer con=new Consumer(r);
		Thread t0 =new Thread(pro);
		Thread t1 =new Thread(pro);
		Thread t2 =new Thread(con);
		Thread t3 =new Thread(con);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}
}
