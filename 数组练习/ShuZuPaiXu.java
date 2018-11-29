public class ShuZuPaiXu 
{
	public static void print(int[] arr)
	{
		System.out.print("[");
		for (int x=0;x<arr.length ;x++ )
		{
			if (x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
    }
	public static void main(String[] args) 
	{
		int[] arr1 ={1,2,3,4,5,6};
		print(arr1);
		bubbleSort(arr1);
	    selectSort(arr1);
		print(arr1);
	}
	/*数组排序
	思路；1；每个元素都与其他元素比较 
		  2；若是从小到大 先将第一个元素与后面的元素进行比较 并将小的那个存储在第一位
		  比较完后再将第二个元素与后面的元素进行比较 重复上面步骤
		  3；全比较完后，就是所求顺序。
		  定义一个功能
		  没有返回值 排序完后直接改变原数组。
		  有参数 一个int数组
	*/
	/*
	选择排序
	*/
	public static void selectSort(int[] arr)
	{
		for (int x=0;x<arr.length-1 ;x++ )
		{
			int num=arr[x];
			int a=x;
			for (int y=x+1;y<arr.length ;y++ )
			{
				if (num>arr[y])
				{
					num=arr[y];
					a=y;
				}
			}
			if (a!=x)
			swap(arr,x,a);

		}
		return ;
	}
	public static void swap(int[] arr,int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	/*
	冒泡排序
	*/
	public static void bubbleSort(int[] arr)
	{
		for (int x=0;x<arr.length-1 ;x++ )
		{
			for (int y=0;y<arr.length-1-x ;y++ )
			{
				if (arr[y]>arr[y+1])
					swap(arr,y,y+1);
			}
		 }   
	}
}
