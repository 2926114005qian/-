class HanShu 
{
	public static void main(String[] args) 
	{
		/*
			练习；获取一到十，十个数的和。
			思路；
			1；参加每次运算的数值不确定。
			2；每次和数据也不确定。
			3；每次都是加法运算。
			4；运算的数在自增。
		*/
		draw(3,4);
		printCFB();
		System.out.println(equals(4,4));
		System.out.println(getMax(2,3));
		System.out.println(getLeve1(86));
		for (int x=1 ;x<=5;x++)
		{
			for (int y=1;y<x;y++ )
			{
				System.out.print(" ");
			}
			for (int y=x;y<=5 ;y++ )
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		/*int c = add(3,4);
		System.out.println(c);*/
	}
	/*public static int add(int a,int b)
	{
		return a+b;
	}*/
	/*需求；定义一个功能，画一个矩形在控制台。
	明确一；这个功能的结果是什么
	没有结果，没有返回值给调用者。
	明确二；这个功能实现过程中是否有未知内容参与运算。
	有，矩形的行和列不确定
	*/
	public static void draw(int row,int col)
	{
		for (int x=1;x<=row ;x++ )
		{
			for (int y=1;y<=col ;y++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		return ;
	}
	/*需求；定义一个功能，比较两个数是否相等。
	明确一；这个功能的结果是什么
	有 返回值为boolean型
	明确二；这个功能实现过程中是否有未知内容参与运算。
	有 两个整数
	*/
	
	public static boolean equals(int x,int y)
	{
		return (x==y);
	}
	/*需求；定义一个功能，获取两个整数中较大的那个数。
	明确一；这个功能的结果是什么
	有 返回值为int。
	明确二；这个功能实现过程中是否有未知内容参与运算。
	有 两个整数。
	*/
	public static int getMax(int x,int y)
	{
		return x>y?x:y;
	}
	/*打印九九乘法表
	  没有返回值
	  有参数 两个整数运算
	*/
	public static void printCFB()
	{
		printCFB(9);
	}
	public static void printCFB(int num)
	{
		for (int x=1;x<=num ;x++ )
		{
			for (int y=1;y<=x ;y++ )
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
		return ;
	}
	/*
		根据分数打印等级
		有结果 char
		有参数 int
	*/
	public static char getLeve1(int a)
	{
		if (a>=90&&a<=100)
			return 'A';
		if (a>=80&&a<=89)
			return 'B';
		if (a>=70&&a<=79)
			return 'C';
		if (a>=60&&a<=69)
			return 'D';
		return 'E';
	}

}
 