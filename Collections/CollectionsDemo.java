package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		Deom_4();
	}

	public static void Deom_4() {
		List<String> li=new ArrayList<String>();
		li.add("aaa");
		li.add("bbb");
		li.add("aaa");
		li.add("cccc");
		li.add("ddd");
		li.add("sss");
		Collections.replaceAll(li,"bbb", "222");
		System.out.println(li);
//		Collections.sort(li);
		Collections.shuffle(li);
		int index=Collections.binarySearch(li, "aaa");
		String max=Collections.max(li);
		System.out.println(index);
		System.out.println(max);
		System.out.println(li);
	}

}
