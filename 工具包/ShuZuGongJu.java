public class  ShuZuGongJu
{
	/**
		建立一个工具类：最大值，打印数组，交换两数组元素位置等等。
		@author 钱
		@version 1
	*/
	private ShuZuGongJu(){}
	/**
		获取数组最大值
		@param arr 获取一个数组
		@return 返回一个int整数
	*/
	public static int getMax(int[] arr)
	{
		int maxIndex=0;
		for (int x=1;x<arr.length ;x++ )
		{
			if (arr[maxIndex]<arr[x])
			{
				maxIndex=x;
			}
		}
		return arr[maxIndex];
	}
	/**
		遍历打印数组
		@param arr 获取一个数组
		
	*/
	 public static void daYin(int[] arr)
	{	
		System.out.print("[");
		for (int x=0;x<arr.length ;x++ )
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println("]");
		}
	}
	/*
		交换两数组元素位置
	*/
	private  static void swap(int[] arr,int x,int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	/**
		数组选择排序
		@param arr 获取一个数组
	*/
	public static void selectsort(int[] arr)
	{
		for (int x=0;x<arr.length-1 ;x++ )
		{
			int num=arr[x];
			int index=x;
			for (int y=x+1;y<arr.length ;y++ )
			{
				if (num>arr[y])
				{
					num=arr[y];
					index=y;
				}
				if(index!=x)
					swap(arr,index,x);
			}
		}
	}
	/**
		数组冒泡排序
		@param arr 获取一个数组
	*/
	public static void bubblesort(int[] arr)
	{ 
		for (int x=0;x<arr.length-1 ;x++ )
		{
			for (int y=0;y<arr.length-1-x ;y++ )
			{
				if (arr[y]>arr[y+1])
				{
					swap(arr,y,y+1);
				}

			}
		}
	}
	/**
		查找数并返回角标
		@param arr 获取一个数组
		@param key 获取一个数
		@return 返回一个int整数
	*/
	public static int getIndex(int[] arr,int key)
	{
		for (int x=0;x<arr.length ;x++ )
		{
			if (arr[x]==key)
			{
				return x;
			}
		}
		return -1;
	}
	/**
		二分查找法
		@param arr 获取一个数组
		@param key 获取一个数
		@return 返回一个int整数
	*/
	public static int halfSearch(int[] arr,int key)
	{
		int min,mid,max;
		min=0;
		max=arr.length-1;
		mid=(min+max)/2;
		while (arr[mid]!=key)
		{
			if(key>arr[mid])
				min=mid+1;
			if(key<arr[mid])
				max=mid-1;
			if(max<min)
				return -1;
			mid=(min+max)/2;
		}
		return mid;
	}
	/**
		进制转换
		@param num 获取一个数
		@param base 获取一个数
		@param offset 获取一个数
	*/
	public static void toHex(int num,int base,int offset)
	{
		if (num==0)
		{
			System.out.println("0");
			return;
		}
		char[] chs={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr =new char[8];
		int pos =arr.length;
		while (num!=0)
		{
			int temp =num&base;
			arr[--pos]=chs[temp];
			num=num>>>offset;
		}
		System.out.println("pos="+pos);
		for (int x=pos;x<arr.length ;x++ )
		{
			System.out.print(arr[x]);
		}
	}
}
