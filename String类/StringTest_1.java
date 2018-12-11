package String.Demo;
/*����һ���ַ������飬�������ֵ�˳���С�������
 * ˼·��
 * 1.�������� ����ѡ��ð����ɡ�
 * 2.forǶ�׺ͱȽ��Լ���λ
 * 3.�ַ����Ƚ���compareTo.
 * */
public class StringTest_1 {

	public static void main(String[] args) {
		String[] arr = {"nba","abc","cba","zz","qq","haha"};
		printArr(arr);
		sortString(arr);
		printArr(arr);
	}

	public static void sortString(String[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length ;j++) {
				if (arr[i].compareTo(arr[j])>0) {
					swap(arr,i,j);
				}
			}
		}
	}

	public static void swap(String[] arr, int i, int j) {
		String temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	private static void printArr(String[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i!=arr.length-1) {
				System.out.print(arr[i]+",");
			}
			else {
				System.out.println(arr[i]+"]");
			}
		}
	}


}
