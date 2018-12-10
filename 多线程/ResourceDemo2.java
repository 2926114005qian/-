/*
�ȴ�/���ѻ���
�漰�ķ���
1.wait():���̴߳��ڶ���״̬����������̴߳����̳߳��С�
2.notify():����һ���̳߳��е�����̡߳�
3.notifyAll():�����̳߳��������̡߳�
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
					r.set("����","ŮŮŮ");
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
		//������Դ
		Resource2 r =new Resource2();
		//��������
		Input2 in =new Input2(r);
		Output2 out=new Output2(r);
		//�����߳�
		Thread t1 =new Thread(in);
		Thread t2 =new Thread(out);
		//�����߳�
		t1.start();
		t2.start();
	}
}
