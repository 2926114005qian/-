package Generic;

import java.util.Iterator;
import java.util.TreeSet;

public class GenericDemo2 {

	public static void main(String[] args) {
		TreeSet<Person> ts=new TreeSet<Person>();
		ts.add(new Person("lisi",20));
		ts.add(new Person("lisi2",23));
		ts.add(new Person("lisi",20));
		ts.add(new Person("lisi3",25));
		Iterator<Person> it=ts.iterator();
		while(it.hasNext()) {
			Person p=it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

}
