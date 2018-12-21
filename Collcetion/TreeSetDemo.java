package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new ComparatorByLength());
		/*comparatorByName实例
		ts.add(new Person("zhangsan",21));
		ts.add(new Person("lisi",22));
		ts.add(new Person("wangwu",25));
		ts.add(new Person("zhaoqi",28));
		ts.add(new Person("xiaoba",29));
		*/
//ComparatorByLength实例
		ts.add("aaa");
		ts.add("ccc");
		ts.add("aaaa");
		ts.add("d");
		ts.add("qqq");
		Iterator it=ts.iterator();
		while (it.hasNext()) {
			/*ComparatorByName实例
			Person p=(Person)it.next();
			System.out.println(p.getName()+":"+p.getAge());
			*/
//ComparatorByLength实例
			System.out.println(it.next());
			
		}
		}

}
