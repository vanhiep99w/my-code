package entities;

import java.util.Objects;

public class ItemGroup {

	private int id;
	private String name;
	
	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroup(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
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

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || (obj instanceof ItemGroup))
			return false;
		ItemGroup other = (ItemGroup) obj;
		return other.getId() == getId();
	}
	
	
}
