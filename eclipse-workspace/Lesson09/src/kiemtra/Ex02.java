package kiemtra;

public class Ex02 {

	public static void main(String[] args) {
		String input = "aa6b546c6e22h";
		System.out.println("Số lớn nhất trong chuỗi : " + findMaxNumber(input));
	}

	public static int findMaxNumber(String input) {
		int maxNumber = 0;
		int tempNumber;
		String testString = "0" + input;
		String[] temp = testString.split("[A-Za-z]+");
		for (int i = 1; i < temp.length; i++) {
			if (temp[i] != null) {
				tempNumber = Integer.parseInt(temp[i]);
				if (maxNumber < tempNumber) {
					maxNumber = tempNumber;
				}
			}
		}
		return maxNumber;
	}
}
