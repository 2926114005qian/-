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
/*	list������ȡ����ʽ��
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
								//�ڵ����������У�����ʹ�ü��ϲ���Ԫ�ء�������쳣����ʱ��Ӧ����list�����з���listIterator����ɡ�
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
