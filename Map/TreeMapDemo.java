package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Student,String> tm=new TreeMap<Student,String>();
		tm.put(new Student("xiaoqiang",20), "成都");
		tm.put(new Student("zhangsan",22), "上海");
		tm.put(new Student("lisi",20), "北京");
		tm.put(new Student("wangwu",20), "大连");
		tm.put(new Student("wangwu",20), "哈哈");
		Iterator<Map.Entry<Student, String>> it=tm.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Student, String> me=it.next();
			Student key=me.getKey();
			String value=me.getValue();
			System.out.println(key.getName()+":"+key.getAge()+":"+value);
			}
		
	}

}
