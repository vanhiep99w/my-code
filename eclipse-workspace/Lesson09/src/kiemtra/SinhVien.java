package kiemtra;

public class SinhVien {

	private int id;
	private String name;
	private String rank;

	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}

	public SinhVien(int id, String name, String rank) {
		this.id = id;
		this.name = name;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
}
