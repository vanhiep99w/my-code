package entities;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Gắn final cho biến sẽ bất biến không cho thay đổi
		
		final IteamBox redBox=new IteamBox("Red Box" , "red", 10, 10);
		final IteamBox yellowBox=new IteamBox("yello Box","yello",8,8);
		//redBox = yellowBox;
		yellowBox.setColor("blue");
		System.out.println(redBox.getColor());
	}

}
