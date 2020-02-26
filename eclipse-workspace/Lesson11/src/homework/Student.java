package homework;

public class Student {

	private String id;
	private String name;
	private float arithMean;

	public Student() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", arithMean=" + arithMean + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getArithMean() {
		return arithMean;
	}

	public void setArithMean(float arithMean) {
		this.arithMean = arithMean;
	}

	public Student(String id, String name, float arithMean) {
		this.id = id;
		this.name = name;
		this.arithMean = arithMean;
	}
}
