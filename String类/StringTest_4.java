package String.Demo;
/*模拟一个trim功能一致的方法
思路；
1.定义两个变量，一个变量作为从头开始判断字符串格的角标，不断++。
			   一个变量作为从尾开始判断字符串空格的角标，不断--。
2.判断倒不是空格为止，取头尾之间的字符串即可。
*/

public class StringTest_4 {

	public static void main(String[] args) {
		String s="    ab   c    ";
		s=myTrim(s);
		System.out.println(s);
	}

	public static String myTrim(String s) {
		int start=0,end=s.length()-1;
		//要判断头是否小于尾。
		while (start<end&&s.charAt(start)==' ') {
			start++;
		}
		while (start<end&&s.charAt(end)==' ') {
			end--;
		}
		String sub =s.substring(start, end+1);
		return sub;
	}

}
