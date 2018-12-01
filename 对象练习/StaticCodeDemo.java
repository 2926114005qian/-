class StaticCode
{
	static
	{
		System.out.println("aaaa");
	}
	static void  show()
	{
		System.out.println("sssss");
	}

}
public class StaticCodeDemo 
{
	public static void main(String[] args) 
	{
		StaticCode.show();
		new StaticCode().show();

	}
}
