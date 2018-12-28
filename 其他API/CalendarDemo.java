package 其他API;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		c.set(2019, 1, 20);
		c.add(Calendar.MONDAY, 1);
		demo_1(c);
	}
	public static void demo_1(Calendar c) {
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DAY_OF_MONTH);
		int week=c.get(Calendar.WEEK_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日"+week);
		
	}

}
