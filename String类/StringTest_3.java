package String.Demo;
/*取两个字符串中最大相同的子串。
 * 思路；
 * 1.先判断小的那个是否包含在长的那里面，若在 短的那个即为所求
 * 2.若不在，将短的进行长度递减取子串，去长串进行判断，若在即为所求。
 * */


public class StringTest_3 {

	public static void main(String[] args) {
		String s1 ="qwerabcdtyuion";
		String s2 ="xcabcdvcn";
		String s = getMaxSubString(s2,s1);
		System.out.println("s="+s);
	}

	public static String getMaxSubString(String s1, String s2) {
		String max=null,min=null;//定义两变量 一个存长串 一个存短串。
		max =(s1.length()>s2.length())?s1:s2;
		min =(max.equals(s1))?s2:s1;
		if (max.contains(min)) {
			return min;
		}
		for (int i = 0; i < min.length(); i++) {
			for (int a = 0,b=min.length()-i; b!= min.length()+1; a++,b++) {
				String sub =min.substring(a, b);
				if (max.contains(sub)) {
					return sub;
				}
			}
		}
		return null;
	}

}
