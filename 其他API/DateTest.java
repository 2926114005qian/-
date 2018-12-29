package 其他API;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		//练习；"2012-3-17"到"2012-4-6"中间有多少天。
		/*
		 * 思路；1将两字符串变成date对象
		 * 	   2将date对象变成毫秒值
		 * 	   3相减 再变成天数。
		 * */
		String s1="2012-3-17";
		String s2="2012-4-6";
		getDay(s1,s2);
	}

	public static void getDay(String s1, String s2) throws ParseException {
		DateFormat dateFormat1=DateFormat.getDateInstance();
		Date d1=dateFormat1.parse(s1);
		Date d2=dateFormat1.parse(s2);
		Long l1=d1.getTime();
		Long l2=d2.getTime();
		Long l3=Math.abs(l2-l1);
		int a=(int)(l3/(1000*60*60*24));
		System.out.println(a+"天");
	}

}
