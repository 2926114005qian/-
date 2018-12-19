package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		List list =new ArrayList();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
//		show(list);
		java.util.ListIterator it = list.listIterator();
		while (it.hasNext()) {
			Object obj=it.next();
			if (obj.equals("abc2")) {
				it.add("abc9");
			}
			else {
				System.out.println(obj);
			}
		}
		System.out.println("hasNext:"+it.hasNext());
		System.out.println("previous:"+it.hasPrevious());
		System.out.println(list);
		}
/*	list的特有取出方式。
	public static void show(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
*/	

/*	public static void show(List list) {
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		Iterator it=list.iterator();
		while (it.hasNext()) {
			Object obj=it.next();//java.util.ConcurrentModificationException
								//在迭代器过程中，不能使用集合操作元素。会出现异常。此时就应该用list的特有方法listIterator来完成。
			if (obj.equals("abc2")) {
				list.add("abc9");
			}
			else {
				System.out.println(obj);
			}
		}
		System.out.println(list);
		}
*/		
		
	
	
	

}
