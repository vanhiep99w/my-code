package collections.list;

public class Employee implements Comparable<Employee>{
	private int id;
	private String fullname;
	private int age;
	private Title title;
	
	public Employee() {
	}

	public Employee(int id, String fullname, int age, Title title) {
		this.id = id;
		this.fullname = fullname;
		this.age = age;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	/*
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		
		if (obj == null || !(obj instanceof Employee)) {
			return false;
		}
		Employee emp = (Employee) obj;
		return this.getId() == emp.getId();
	}
	*/
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullname=" + fullname + ", age=" + age
				+ ", title=" + title + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
}