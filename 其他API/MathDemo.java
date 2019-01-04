package ∆‰À˚API;

public class MathDemo {

	public static void main(String[] args) {
		demo_1();
	}

	public static void demo_1() {
		double d1=Math.ceil(11.5);
		double d2=Math.floor(11.5);
		double d3=Math.round(11.4);
		double d4=Math.max(11.0, 12.0);
		double d5=Math.pow(10, 2);
		double d6=(int)(Math.random()*10);
		demo_2(d1);
		demo_2(d2);
		demo_2(d3);
		demo_2(d4);
		demo_2(d5);
		demo_2(d6);
	}

	public static void demo_2(double d) {
		System.out.println(d);
	}

}
