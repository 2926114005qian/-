package Wrapper.Demo;

import java.util.Arrays;
public class WrapperDemo {

	public static void main(String[] args) {
		String numStr ="20 78 9 -7 88 36 29";
		System.out.println(numStr);
		numStr= sortStringNumber(numStr);
		System.out.println(numStr);
	}

	public static String sortStringNumber(String numStr) {
		//1.将字符串变成字符串数组。
		String[] str_arr=stringToArray(numStr);
		//2.将字符串数组变成int数组。
		int[] num_arr=intToArray(str_arr);
		//3.对int数组进行排序。
		mysortArray(num_arr);
		//4.将int数组转换成字符串。
		String temp =arrayToString(num_arr);
		return temp;
		
	}

	public static String arrayToString(int[] num_arr) {
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < num_arr.length; i++) {
			if (i!=num_arr.length-1) {
				sb.append(num_arr[i]+" ");
			}else {
				sb.append(num_arr[i]);
			}
		}
		return sb.toString();
	}

	public static void mysortArray(int[] num_arr) {
		Arrays.sort(num_arr);
	}

	public static int[] intToArray(String[] str_arr) {
		int[] num_arr=new int[str_arr.length];
		for (int i = 0; i < str_arr.length; i++) {
			num_arr[i]=Integer.parseInt(str_arr[i]);
		}
		return num_arr;
	}

	public static String[] stringToArray(String numStr) {
		String[] str_arr =numStr.split(" ");
		return str_arr;
	}

}
