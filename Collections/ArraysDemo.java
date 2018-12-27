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
		//集合转数组
		List<String> list=new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		String[] str=list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(str));
	}

	public static void arrays() {
		//将数组转成集合
		String[] sts= {"aa","bb","cc","dd"};
		List<String> li=Arrays.asList(sts);
		boolean b=li.contains("aa");
		System.out.println(b);
		//基本数值类型并不可以直接转成集合
		int[] arr= {2,5,6,85,56};
		List<int[]> list=Arrays.asList(arr);
		boolean a=list.contains(5);
		System.out.println(a);
	}

}
