package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(new Person("����1",21));
		a.add(new Person("����2",22));
		a.add(new Person("����3",23));
		a.add(new Person("����4",24));
		Iterator it=a.iterator();
		while (it.hasNext()) {
			Person p=(Person) it.next();
			System.out.println(p.getName()+"..."+p.getAge());
		}
		
	}

}
