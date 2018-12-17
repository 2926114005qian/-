package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("abc");
		al.add("abc1");
		al.add("abc1");
		al.add("abc2");
		al.add("abc2");
		System.out.println(al);
		al=getSingleElements(al);
		System.out.println(al);
		
	}

	public static ArrayList getSingleElements(ArrayList al) {
		ArrayList temp=new ArrayList();
		Iterator it=al.iterator();
		while (it.hasNext()) {
			Object obj=it.next();
			if (!temp.contains(obj)) {
				temp.add(obj);
			}
		}
		return temp;
	}

}
