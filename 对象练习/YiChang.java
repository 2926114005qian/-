class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}
	FuShuIndexException(String a)
	{
		super(a);
	}
}
class Demo 
{
	int[] arr=new int[2];
	public void show() throws FuShuIndexException //����
	{
		throw new FuShuIndexException("�����Ǳ�Խ����");
	}
}
class YiChang 
{
	public static void main(String[] args)//throws FuShuIndexException  ����
	{
		Demo b=new Demo();
		try
		{
			b.show();
		}
		catch (FuShuIndexException a)
		{
			a.printStackTrace();
		}
	}
}
