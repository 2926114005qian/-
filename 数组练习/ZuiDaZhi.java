public class ZuiDaZhi 
{
	public static void main(String[] args) 
	{
		int[] arr1 ={1,2,3,4,5,6};
		System.out.println(getMax(arr1));
		System.out.println(getMax2(arr1));
	}
	/*
			��ȡ��������ֵ
			˼·��
			1����Ҫ���бȽϣ�������һ����������¼�ϴ���Ǹ�ֵ��
			2����������б�����������������������д洢�����ݽ��бȽϣ�
			�����ϴ�����ݴ洢�ڱ����С�
			3�����������������д洢�ľ������ֵ��
			����һ��������ʵ��
			�н�� һ��int�͵�����
			�в��� ing�͵�����
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
