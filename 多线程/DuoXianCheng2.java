class Demo /*extends Thread�̳еķ�ʽ*/implements Runnable
{
	private /*static�����ݱ�ɹ���� ���������õ�ͬһ������*/ int num =1;
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
		Demo t =new Demo();//����һ��Runnable�ӿ��������
		Thread t1=new Thread(t);//�������ĸ��̶߳��� ��������ͬ��Runnable�ӿ��������
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		/*�������ĸ��߳��������
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
