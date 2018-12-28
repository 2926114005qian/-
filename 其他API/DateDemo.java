package 其他API;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		timeDemo_1();
		timeDemo_2();
		timeDemo_3();
	}

	public static void timeDemo_3() throws ParseException {
		DateFormat dateFormat=DateFormat.getDateInstance();
		dateFormat=new SimpleDateFormat("yyyy---MM---dd");
		String str_date="2019-5-6";
		str_date="2018---3---5";
		Date date=dateFormat.parse(str_date);
		System.out.println(date);
	}

	public static void timeDemo_2() {
		Date date=new Date();
		//获取默认风格的日期格式化对象
//		DateFormat dateFormat=DateFormat.getDateInstance();
		//获取指定风格的日期格式化对象
//		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.FULL);
		//获取带时间的日期格式化对象
//		DateFormat dateFormat=DateFormat.getDateTimeInstance();
		//获取带时间且带指定风格的日期格式化对象
//		DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		//自定义风格
		DateFormat dateFormat=new SimpleDateFormat("yyyy--MM--dd");
		String str_date=dateFormat.format(date);
		System.out.println(str_date);
	}

	public static void timeDemo_1() {
		//获取当前时间的毫秒值
		Long time=System.currentTimeMillis();
		//将当前日期和时间封装成Date对象
		Date date=new Date();
		System.out.println(date);
		//将指定毫秒值封装成Date对象
		Date date2=new Date(1545811637695l);
		System.out.println(date2);
	}

}
