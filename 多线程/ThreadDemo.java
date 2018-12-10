class Demo implements Runnable
{
	private boolean flag =true;
	public void getFlag()
	{
		flag=false;
	}
	public void run()
	{
		while (flag)
		{
			System.out.println(Thread.currentThread().getName()+"...."+111);
		}
	}
}
class Demo1 implements Runnable
{
	public void run()
	{
		for (int x=1;x<=50 ;x++ )
			{
				/*if(x==50)
					t.getFlag();*/
				System.out.println(Thread.currentThread().getName()+"...."+x);
			}
	}
}
class ThreadDemo
{
	public static void main(String[] args) 
	{
		Demo t =new Demo();
		Demo1 r =new Demo1();
		Thread t1 =new Thread(t);
		Thread t2 =new Thread(t);
		Thread t3 =new Thread(r);
//		t1.setDaemon(true);
		t1.start();
//		t2.setDaemon(true);
		t2.start();
		t3.start();
		try{t3.join();}catch(InterruptedException e){}

		for (int x=1;x<=50 ;x++ )
		{
			/*if(x==50)
				t.getFlag();*/
			System.out.println(Thread.currentThread().getName()+"...."+x);
		}
	}
}
