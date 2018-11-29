public class ZuiDaZhi 
{
	public static void main(String[] args) 
	{
		int[] arr1 ={1,2,3,4,5,6};
		System.out.println(getMax(arr1));
		System.out.println(getMax2(arr1));
	}
	/*
			获取数组的最大值
			思路；
			1；需要进行比较，并定义一个变量来记录较大的那个值。
			2；对数组进行遍历，将遍历的数据与变量中存储的数据进行比较，
			并将较大的数据存储在变量中。
			3；遍历结束，变量中存储的就是最大值。
			定义一个功能来实现
			有结果 一个int型的整数
			有参数 ing型的数组
	*/
	public static int getMax(int[] arr)
	{
		int x=arr[0];
		for (int y=1;y<arr.length ;y++ )
		{
			if (x<arr[y])
			{
				x=arr[y];
			}
		}
		return x;
	}
	public static int getMax2(int[] arr)
	{
		int x=0;
		for (int y=1;y<arr.length ;y++ )
		{
			if (arr[x]<arr[y])
			{
				x=y;
			}
		}
		return arr[x];
	}
}
