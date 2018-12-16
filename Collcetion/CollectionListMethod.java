package Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionListMethod {

	public static void main(String[] args) {
		List list =new ArrayList();
		show(list);
	}

	public static void show(List list) {
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
//		System.out.println("remove:"+list.remove(1));
//		System.out.println("set:"+list.set(1,"abc8"));
//		System.out.println("get:"+list.get(1));
		System.out.println("subList:"+list.subList(1,2));
		System.out.println(list);
	}

}
