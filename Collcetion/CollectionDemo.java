package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		Collection c2=new ArrayList();
		show(c1,c2);
	}

	/**
	 * @param c1
	 * @param c2
	 */
	public static void show(Collection c1, Collection c2) {
		c1.add("axc");
		c1.add("546");
		c1.add("qwe");
		c2.add("asd");
		c2.add("123");
		c2.add("rty");
		c2.add("546");
//		c1.addAll(c2);
//		c1.removeAll(c2);
//		c1.retainAll(c2);
		boolean b=c1.isEmpty();
		System.out.println(c1);
		System.out.println(b);
/*		Iterator it= c1.iterator();
		while ( it.hasNext()) {
			System.out.println(it.next());
			
		}
*/
		for (Iterator it=c1.iterator();it.hasNext() ; ) {
			System.out.println(it.next());
		}
	}

/*	public static void show(Collection c1) {
		c1.add("axc");
		c1.add("546");
		c1.add("qwe");
		c1.
		System.out.println(c1);
	}
*/	

}
