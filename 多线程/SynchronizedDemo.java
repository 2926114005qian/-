class SynFunctionDemo /*extends Thread�̳еķ�ʽ*/implements Runnable
{
	private /*��̬����*/static
			/*static�����ݱ�ɹ���� ���������õ�ͬһ������*/ int num =100;
	public  void run()
	{
		sale();
	}
//	Object obj =new Object();
	boolean flag = true;//����һ��boolean����
	public  void sale()
	{
		if(flag)//�����ж� ��o�߳�ִ��ͬ�������
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
				else //��1�߳�ִ��ͬ������
					break;
				}
			}
		}
		else 
			this.show();
	}
	public static/*��̬����*/ synchronized void show()//ͬ������
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
		SynFunctionDemo t =new SynFunctionDemo();//����һ��Runnable�ӿ��������
		Thread t1=new Thread(t);//�������ĸ��̶߳��� ��������ͬ��Runnable�ӿ��������
		Thread t2=new Thread(t);
		t1.start();
		try{Thread.sleep(10);}catch(InterruptedException e){}//�����߳�˯��10����
		t.flag=false;
		t2.start();
	}
}
