package ∆‰À˚API;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	public static void main(String[] args) {
		demo_1();
	}

	public static void demo_1() {
		Long lo=System.currentTimeMillis();
		Properties pro=System.getProperties();
		System.out.println(lo);
		Set<String> nameSet=pro.stringPropertyNames();
		for (String string : nameSet) {
			String value=pro.getProperty(string);
			System.out.println(string+"::"+value);
		}
		
	}

}
