package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericAdvanceDemo {

	public static void main(String[] args) {
		ArrayList<Person> al1=new ArrayList<Person>();
		al1.add(new Person("lisi",20));
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("asd");
		al2.add("zxc");
		al2.add("qwe");
		printCollection(al1);
		printCollection(al2);
	}

	public static void printCollection(Collection<? extends Object> al) {
		Iterator<?> it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
