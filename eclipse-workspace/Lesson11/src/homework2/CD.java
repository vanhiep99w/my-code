package homework2;

public class CD {

	private int id;
	private String kind;
	private String singer;
	private int amountSongs;
	private float price;
	public CD() {
		// TODO Auto-generated constructor stub
	}
	public CD(int id, String kind, String singer, int amountSongs, float price) {
		this.id = id;
		this.kind = kind;
		this.singer = singer;
		this.amountSongs = amountSongs;
		this.price = price;
	}
	@Override
	public String toString() {
		return "id [id=" + id + ", kind=" + kind + ", singer=" + singer + ", amountSongs=" + amountSongs + ", price="
				+ price + "]";
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getAmountSongs() {
		return amountSongs;
	}
	public void setAmountSongs(int amountSongs) {
		this.amountSongs = amountSongs;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
