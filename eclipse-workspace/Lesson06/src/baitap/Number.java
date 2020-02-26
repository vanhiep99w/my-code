package baitap;

public class Number {

	int value;
	String stringValue;
	
	public Number() {
		
	}
	public Number(int value) {
		this.value=value;
		switch (value) {
		case 1:this.stringValue="Một ";
			break;
		case 2:this.stringValue="Hai ";
		break;
		case 3:this.stringValue="Ba ";
		break;
		case 4:this.stringValue="Bốn ";
		break;
		case 5:this.stringValue="Năm ";
		break;
		case 6:this.stringValue="Sáu ";
		break;
		case 7:this.stringValue="Bảy ";
		break;
		case 8:this.stringValue="Tám ";
		break;
		case 9:this.stringValue="Chín ";
		break;
		case 0:this.stringValue=" ";
		break;

		default:
			break;
		}
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
}
