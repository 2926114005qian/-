
package Collection;

public class LinkedListTest {

	public static void main(String[] args) {
		DuiLie d =new DuiLie();
		d.myAdd("abc1");
		d.myAdd("abc2");
		d.myAdd("abc3");
		d.myAdd("abc4");
		while (!d.isNull()) {
			System.out.println(d.myGet());
		}
	}

}
