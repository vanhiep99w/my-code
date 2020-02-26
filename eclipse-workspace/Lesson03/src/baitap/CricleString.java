package baitap;

public enum CricleString {

	INSIDE("Trong đường tròn"),ONSIDE("Trên đường tròn"),OUTSIDE("Ngoài đường tròn");
	String value;
	CricleString(String value){
		this.value=value;
	}
	public String getValue() {
		return value;
	}
}
