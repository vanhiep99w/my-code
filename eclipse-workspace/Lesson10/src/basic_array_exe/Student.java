package basic_array_exe;

public class Student {

	private String id;
	private String name;
	private float avgPoint;
	private boolean gender;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", avgPoint=" + avgPoint + ", gender=" + gender + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAvgPoint() {
		return avgPoint;
	}
	public void setAvgPoint(float avgPoint) {
		this.avgPoint = avgPoint;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Student(String id, String name, float avgPoint, boolean gender) {
		this.id = id;
		this.name = name;
		this.avgPoint = avgPoint;
		this.gender = gender;
	}
}
