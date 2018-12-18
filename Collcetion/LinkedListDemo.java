package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList link =new LinkedList();
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		link.addLast("abc5");
		System.out.println(link);
		System.out.println(link.getFirst());
//		System.out.println(link.removeFirst());
//		System.out.println(link);
		while (!(link.isEmpty())) {
			System.out.println(link.removeLast());
			
		}
	}

}
