package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Student,String> hm=new HashMap<Student,String>();
		hm.put(new Student("xiaoqiang",20), "�ɶ�");
		hm.put(new Student("zhangsan",22), "�Ϻ�");
		hm.put(new Student("lisi",20), "����");
		hm.put(new Student("wangwu",20), "����");
		hm.put(new Student("wangwu",20), "����");
//		Set<Student> keySet=hm.keySet();
//		Iterator<Student> it=keySet.iterator();
		Iterator<Student> it=hm.keySet().iterator();
		while(it.hasNext()) {
			Student stu=it.next();
			String value=hm.get(stu);
			System.out.println(stu.getName()+":"+stu.getAge()+":"+value);
		}
	}

}
