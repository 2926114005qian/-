package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {
		int[] arr= {2,3,5,8,6};
		//ForEach”Ôæ‰  ∏ﬂº∂for
		for (int i : arr) {
			System.out.println(i);
		}
		List<String> list=new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		for (String string : list) {
			System.out.println(string);
		}
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		for (Integer key : map.keySet()) {
			String value=map.get(key);
			System.out.println(key+":"+value);
		}
		for(Map.Entry<Integer,String> me:map.entrySet()) {
			Integer key=me.getKey();
			String value=me.getValue();
			System.out.println(key+":"+value);
		}
	}

}
