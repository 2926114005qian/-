public class JinZhi 
{
	public static void main(String[] args) 
	{
		shiLiu(60);
		er(60);
		ba(60);
	}
	/*
		�����û�����ת������
	*/
//ʮ����-->>ʮ������
	public static void shiLiu(int num)
	{
		toHex(num,15,4);
	}
//ʮ����-->>������
    public static void er(int num)
	{
		toHex(num,1,1);
	}
//ʮ����-->>�˽���
    public static void ba(int num)
	{
		toHex(num,7,3);
	}
//��ȡһ�����Ľ���
	public static void toHex(int num,int base,int offset)
	{
		if (num==0)
		{
			System.out.println("0");
			return;
		}
		char[] chs={'0','1','2','3',
			        '4','5','6','7',
					'8','9','A','B',
					'C','D','E','F'};
		char[] arr =new char[8];
		int pos =arr.length;
		while (num!=0)
		{
			int temp =num&base;
			arr[--pos]=chs[temp];
			num=num>>>offset;
		}
		System.out.println("pos="+pos);
		for(int x=pos;x<arr.length;x++)
			System.out.print(arr[x]);
		System.out.println();
	}
}
