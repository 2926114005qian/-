package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map =new HashMap();
//		method(map);
//		methodKeySet(map);
//		methodEnTrySet(map);
		methodValues(map);
	}

	public static void methodValues(Map<Integer, String> map) {
		map.put(2, "ssss");
		map.put(5, "aaaa");
		map.put(8, "cccc");
		map.put(6, "bbbb");
		map.put(1, "dddd");
		Collection<String> values=map.values();
		Iterator<String> it=values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void methodEnTrySet(Map<Integer, String> map) {
		map.put(2, "ssss");
		map.put(5, "aaaa");
		map.put(8, "cccc");
		map.put(6, "bbbb");
		map.put(1, "dddd");
		Set<Map.Entry<Integer, String>> enTrySet=map.entrySet();
		Iterator<Map.Entry<Integer, String>> it=enTrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,String> me=it.next();
			Integer key=me.getKey();
			String Value=me.getValue();
			System.out.println(key+":"+Value);
			}
	}

	public static void methodKeySet(Map<Integer, String> map) {
		map.put(2, "ssss");
		map.put(5, "aaaa");
		map.put(8, "cccc");
		map.put(6, "bbbb");
		map.put(1, "dddd");
		Set<Integer> KeySet =map.keySet();
		Iterator<Integer> it=KeySet.iterator();
		while (it.hasNext()) {
			Integer key =it.next();
			String value=map.get(key);
			System.out.println(key+":"+value);
			
		}
	}

	public static void method(Map<Integer, String> map) {
		System.out.println(map.put(8, "lisi"));
		System.out.println(map.put(8, "zhangsan"));
//添加		
		map.put(2, "ssss");
		map.put(7, "aaaa");
		System.out.println(map);//无序的。
//删除
		map.remove(2);
		System.out.println(map);
//判断
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("aaaa"));
		System.out.println(map.isEmpty());
//获取
		System.out.println(map.get(8));
		System.out.println(map.size());
	}

}
