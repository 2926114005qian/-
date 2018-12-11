package String.Demo;
/*一个子串在长串中出现的次数。
 * 思路；
 * 1.要找的子串是否存在，若在，获取其位置。
 * 2.找到之后，记录其位置，并继续寻找，继续寻找的起始位为出现位置加子串长度。
 * 3.以此类推，通过循环完成 如果查不到就返回-1，并用计数器记录次数。
 * */
public class StringTest_2 {

	public static void main(String[] args) {
		String str ="nbaernbatynbauinbaopnba";
		String key ="nba";
		int x=getStringIndex(str,key);
		System.out.println(x);
	}

	public static int getStringIndex(String str, String key) {
		int count =0;
		int index=0;
		while ((index=str.indexOf(key,index))!=-1) {
			index=index+key.length();
			count++;
		}
		return count;
	}


}
