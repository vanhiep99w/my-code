package throwthrows;

public class AgeService {

	public static void main(String[] args) {
		
	}
	public static void test() {
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static boolean validateAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("còn nhỏ không được xem phim người lớn");
		}
		System.out.println("mua vé thành công");
		return true;
	}
}
