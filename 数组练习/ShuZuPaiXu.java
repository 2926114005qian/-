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
	/*��������
	˼·��1��ÿ��Ԫ�ض�������Ԫ�رȽ� 
		  2�����Ǵ�С���� �Ƚ���һ��Ԫ��������Ԫ�ؽ��бȽ� ����С���Ǹ��洢�ڵ�һλ
		  �Ƚ�����ٽ��ڶ���Ԫ��������Ԫ�ؽ��бȽ� �ظ����沽��
		  3��ȫ�Ƚ���󣬾�������˳��
		  ����һ������
		  û�з���ֵ �������ֱ�Ӹı�ԭ���顣
		  �в��� һ��int����
	*/
	/*
	ѡ������
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
	ð������
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
