package String.Demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		testStringBuffer(sb);
		System.out.println(sb.toString());
	}

	public static void testStringBuffer(StringBuffer s) {
		s.append(1).append("ss");
		s.insert(2,11);
		s.delete(1, 2);
		s.replace(1, 2, "a");
	}

}
