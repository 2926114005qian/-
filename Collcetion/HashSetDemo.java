package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("abc1");
		hs.add("abcd1");
		hs.add("abcf1");
		hs.add("ab1");
		Iterator it=hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
