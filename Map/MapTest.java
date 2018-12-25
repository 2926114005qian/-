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
		//���ַ�������ַ�����
		char[] chs=str.toCharArray();
		//����Map����
		Map<Character,Integer> map=new TreeMap<Character,Integer>();
		for (int i = 0; i < chs.length; i++) {
			//��׳���ж�
			if (!(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i]<='Z')) {
				continue;
			}
			//���������¼����
			int count=1;
			//���������¼ֵ
			Integer value=map.get(chs[i]);
			//��ֵ��Ϊ�ж�
			if (value!=null) {
				count=value+1;
			}
			//������ֵ��ӽ�map����
			map.put(chs[i], count);
		}
		return mapToString(map);
	}

	private static String mapToString(Map<Character, Integer> map) {
		StringBuilder sb=new StringBuilder();
		//����map����
		Iterator<Character> it=map.keySet().iterator();
		while(it.hasNext()) {
			Character key=it.next();
			Integer value=map.get(key);
			sb.append(key+"("+value+")");
		}
		return sb.toString();
	}

}
