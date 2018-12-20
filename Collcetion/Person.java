package Collection;


public class Person implements Comparable {
	private String name;
	private int age;
	@Override
	public int hashCode() {
		System.out.println(this+"......hashcode");
		return name.hashCode()+age*39;
	}
	@Override
	public boolean equals(Object obj) {
		Person p=(Person)obj;
		System.out.println(this+"......equals");
		return this.name.equals(p.name)&&this.age==p.age;
	}
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return name+":"+age;
	}
	@Override
	public int compareTo(Object o) {
		Person p=(Person)o;
		int temp=this.name.compareTo(p.name);
		return temp==0?this.age-p.age:temp;
//		int temp=this.age-p.age;
//		return temp==0?this.name.compareTo(p.name):temp;

	}
}
