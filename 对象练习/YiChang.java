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
	public void show() throws FuShuIndexException //声明
	{
		throw new FuShuIndexException("负数角标越界了");
	}
}
class YiChang 
{
	public static void main(String[] args)//throws FuShuIndexException  声明
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
