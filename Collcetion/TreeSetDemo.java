package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new ComparatorByLength());
		/*comparatorByNameʵ��
		ts.add(new Person("zhangsan",21));
		ts.add(new Person("lisi",22));
		ts.add(new Person("wangwu",25));
		ts.add(new Person("zhaoqi",28));
		ts.add(new Person("xiaoba",29));
		*/
//ComparatorByLengthʵ��
		ts.add("aaa");
		ts.add("ccc");
		ts.add("aaaa");
		ts.add("d");
		ts.add("qqq");
		Iterator it=ts.iterator();
		while (it.hasNext()) {
			/*ComparatorByNameʵ��
			Person p=(Person)it.next();
			System.out.println(p.getName()+":"+p.getAge());
			*/
//ComparatorByLengthʵ��
			System.out.println(it.next());
			
		}
		}

}
