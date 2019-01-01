package Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("aas");
		al.add("axc");
		Iterator<String> it=al.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
	}

}
