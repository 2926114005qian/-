package Collection;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetTest {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		Person p1=new Person("zhangsan",20);
		hs.add(p1);
		hs.add(p1);
		hs.add(new Person("lisi3",23));
		hs.add(new Person("lisi4",24));
		Iterator it=hs.iterator();
		while (it.hasNext()) {
			Person p=(Person)it.next();
			System.out.println(p.getName()+".."+p.getAge());
		}
	}

}
