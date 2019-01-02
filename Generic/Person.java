package Generic;

public class Person implements Comparable<Person> {
		public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
		public Person() {
		super();
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
		private String name;
		private int age;
		@Override
		public int compareTo(Person o) {
			int temp=this.age-o.age;
			return temp==0?this.name.compareTo(o.name):temp;
		}
	

}
