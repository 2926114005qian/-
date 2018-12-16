package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(new Person("李四1",21));
		a.add(new Person("李四2",22));
		a.add(new Person("李四3",23));
		a.add(new Person("李四4",24));
		Iterator it=a.iterator();
		while (it.hasNext()) {
			Person p=(Person) it.next();
			System.out.println(p.getName()+"..."+p.getAge());
		}
		
	}

}
