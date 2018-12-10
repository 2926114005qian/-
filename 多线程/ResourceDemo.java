//������Դ
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
//�������
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
					r.set("����","ŮŮŮ");
				}
			x=(x+1)%2;
		}
	}
}
//�������
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
		//������Դ ���ҿ�����Ϊһ�ѹ��е���������
		Resource r =new Resource();
		//��������
		Input in =new Input(r);
		Output out=new Output(r);
		//�����߳�
		Thread t1 =new Thread(in);
		Thread t2 =new Thread(out);
		//�����߳�
		t1.start();
		t2.start();
	}
}
