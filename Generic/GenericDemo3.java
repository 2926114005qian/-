package Generic;

public class GenericDemo3 {

	public static void main(String[] args) {
/*		泛型类
		Tool<Person> tl=new Tool<Person>();
		tl.setQ(new Person("lisi",50));
		tl.getQ();
		*/
//泛型方法
		Tool<String> tl=new Tool<String>();
		tl.show("abc");
		tl.print("aaaa");
		tl.print(new Integer(8));
		tl.method("bbbb");
		tl.method(new Integer(8));
		}

}
