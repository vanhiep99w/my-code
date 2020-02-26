package stringutils;

public class BaiTapTrenLop {

	public static void main(String[] args) {
		String [] arrStr = new String[]{"d:/music/vetnangcuoitroi.mp3",
				" d:/music/vetnangcuoitroi.mp3",
				" d:/music/vetnangcuoitroi.mp3",
				" d:/music/vetnangcuoitroi.mp3"};
		for(int i=0;i<arrStr.length;i++) {
			if(arrStr[i].endsWith(".mp3")) {
				int n=arrStr[i].lastIndexOf("/");
				int m=arrStr[i].lastIndexOf(".mp3");
				arrStr[i]=arrStr[i].substring(n+1, m);
				System.out.println(arrStr[i]);
			}
		}
	}
	
}
