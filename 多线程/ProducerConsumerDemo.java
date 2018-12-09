//lock�ӿڴ���synchronized(ͬ��)
//Condition����object�ļ���������
//synchronized�ļ�����������wait() notify() notifyAll()
//Condition�ļ���������:await() signal() signalAll()
//lock�ӿڴ�������Condition����  Condition c=lock.newCondition(); �����ж����������
import java.util.concurrent.locks.*;//����newlock�����������
class Resource
{
	private String name;
	private int count=1;
	private boolean flag =false;
//����һ��lock����
	Lock lock = new ReentrantLock();
//���ƶ����ϴ������������
	Condition producer_con =lock.newCondition();
	Condition comsumer_con =lock.newCondition();
	public /*synchronized*/ void setName(String name)
	{
		lock.lock();//��ȡ��
		try
		{
			while (flag)
			{
//				try{wait();}catch(InterruptedException e){}
				try{producer_con.await();}catch(InterruptedException e){}
			}
			this.name= name + count;
			count++;
			System.out.println(Thread.currentThread().getName()+"...������..."+this.name);
			flag=true;
//			notifyAll();
//			c1.signalAll();
			comsumer_con.signal();
		}
		finally//�������ͷ����Ĳ��������
		{
			lock.unlock();//�ͷ���
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
			System.out.println(Thread.currentThread().getName()+"...������....."+this.name);
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
			r.setName("��Ѽ");
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
