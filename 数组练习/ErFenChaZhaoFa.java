public class ErFenChaZhaoFa 
{
	public static void main(String[] args) 
	{
		int[] arr1 ={1,2,3,4,5,6};
		System.out.println(halfSearch_2(arr1,5));
		System.out.println(halfSearch(arr1,5));
	}
	/*
	二分查找法
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
			else if(key<arr[mid])
				max=mid-1;
			if(max<min)
				return -1;
			mid=(max+min)/2;
		}
		return mid;
	}
	public static int halfSearch_2(int[] arr,int key)
	{
		int min,max,mid;
		min=0;
		max=arr.length-1;
		while (min<=max)
		{
			mid=(min+max)/2;
			if(key>arr[mid])
				min=mid+1;
			else if(key<arr[mid])
				max=mid-1;
			else
				return mid;
		}
		return -1;
	}
}
