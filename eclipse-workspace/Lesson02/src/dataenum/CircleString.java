package dataenum;

public enum CircleString {
	INSIDE("Trong duong tron"), ONSIDE("Tren duong tron"), OUTSIDE("Ngoai duong tron");

	String value;

	CircleString(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
