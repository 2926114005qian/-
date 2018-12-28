package ����API;

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
		//��ȡĬ�Ϸ������ڸ�ʽ������
//		DateFormat dateFormat=DateFormat.getDateInstance();
		//��ȡָ���������ڸ�ʽ������
//		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.FULL);
		//��ȡ��ʱ������ڸ�ʽ������
//		DateFormat dateFormat=DateFormat.getDateTimeInstance();
		//��ȡ��ʱ���Ҵ�ָ���������ڸ�ʽ������
//		DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		//�Զ�����
		DateFormat dateFormat=new SimpleDateFormat("yyyy--MM--dd");
		String str_date=dateFormat.format(date);
		System.out.println(str_date);
	}

	public static void timeDemo_1() {
		//��ȡ��ǰʱ��ĺ���ֵ
		Long time=System.currentTimeMillis();
		//����ǰ���ں�ʱ���װ��Date����
		Date date=new Date();
		System.out.println(date);
		//��ָ������ֵ��װ��Date����
		Date date2=new Date(1545811637695l);
		System.out.println(date2);
	}

}
