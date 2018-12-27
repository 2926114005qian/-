package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		arrays();
		toArrays();
	}

	public static void toArrays() {
		//����ת����
		List<String> list=new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		String[] str=list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(str));
	}

	public static void arrays() {
		//������ת�ɼ���
		String[] sts= {"aa","bb","cc","dd"};
		List<String> li=Arrays.asList(sts);
		boolean b=li.contains("aa");
		System.out.println(b);
		//������ֵ���Ͳ�������ֱ��ת�ɼ���
		int[] arr= {2,5,6,85,56};
		List<int[]> list=Arrays.asList(arr);
		boolean a=list.contains(5);
		System.out.println(a);
	}

}
