package dataenum;

public class Consonant {

	
	private int valPosition;
	private String stringPosition;
	public Consonant() {
		// TODO Auto-generated constructor stub
	}
	
	public Consonant(int valPosition) {
	
		this.valPosition = valPosition;
		switch (valPosition) {
		case 1:this.stringPosition=" ";
			break;
		case 2:this.stringPosition="mươi ";
		break;
		case 3:this.stringPosition="trăm ";
		break;

		default:
			break;
		}
	}

	public int getValPosition() {
		return valPosition;
	}
	public void setValPosition(int valPosition) {
		this.valPosition = valPosition;
	}
	public String getStringPosition() {
		return stringPosition;
	}
	public void setStringPosition(String stringPosition) {
		this.stringPosition = stringPosition;
	}
	
}
