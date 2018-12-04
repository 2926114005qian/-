public class  ShuZuGongJu
{
	/**
		����һ�������ࣺ���ֵ����ӡ���飬����������Ԫ��λ�õȵȡ�
		@author Ǯ
		@version 1
	*/
	private ShuZuGongJu(){}
	/**
		��ȡ�������ֵ
		@param arr ��ȡһ������
		@return ����һ��int����
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
		������ӡ����
		@param arr ��ȡһ������
		
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
		����������Ԫ��λ��
	*/
	private  static void swap(int[] arr,int x,int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	/**
		����ѡ������
		@param arr ��ȡһ������
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
		����ð������
		@param arr ��ȡһ������
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
		�����������ؽǱ�
		@param arr ��ȡһ������
		@param key ��ȡһ����
		@return ����һ��int����
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
		���ֲ��ҷ�
		@param arr ��ȡһ������
		@param key ��ȡһ����
		@return ����һ��int����
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
		����ת��
		@param num ��ȡһ����
		@param base ��ȡһ����
		@param offset ��ȡһ����
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
