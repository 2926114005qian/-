package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		String str="fdgavcbsacdfa";
		String s=getCharCount(str);
		System.out.println(s);
	}

	public static String getCharCount(String str) {
		//将字符串变成字符数组
		char[] chs=str.toCharArray();
		//定义Map集合
		Map<Character,Integer> map=new TreeMap<Character,Integer>();
		for (int i = 0; i < chs.length; i++) {
			//健壮性判断
			if (!(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i]<='Z')) {
				continue;
			}
			//定义变量记录次数
			int count=1;
			//定义变量记录值
			Integer value=map.get(chs[i]);
			//将值作为判断
			if (value!=null) {
				count=value+1;
			}
			//将键和值添加进map集合
			map.put(chs[i], count);
		}
		return mapToString(map);
	}

	private static String mapToString(Map<Character, Integer> map) {
		StringBuilder sb=new StringBuilder();
		//迭代map集合
		Iterator<Character> it=map.keySet().iterator();
		while(it.hasNext()) {
			Character key=it.next();
			Integer value=map.get(key);
			sb.append(key+"("+value+")");
		}
		return sb.toString();
	}

}
