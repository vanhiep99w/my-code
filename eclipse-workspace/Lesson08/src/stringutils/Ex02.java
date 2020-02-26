package stringutils;

public class Ex02 {
	public static void main(String[] args) {
		String s = "aaAb2QD123#$@";
		// Viết phương thức kiểm tra xem trong chuỗi có bao nhiêu kí tự in hoa,
		// thường, số.
		// Yêu cầu: Chỉ viết 1 hàm duy nhất

		Counter counter = new Ex02().count(s);
		System.out.println(counter);
	}

	private Counter count(String input) {
		int upperLetterQty = 0;
		int lowerLetterQty = 0;
		int digitLetterQty = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				upperLetterQty++;
				continue;
			}

			if (Character.isLowerCase(c)) {
				lowerLetterQty++;
				continue;
			}

			if (Character.isDigit(c)) {
				digitLetterQty++;
				continue;
			}
		}
		return new Counter(upperLetterQty, lowerLetterQty, digitLetterQty);
	}
}

class Counter {
	private int upperLetterQty;
	private int lowerLetterQty;
	private int digitLetterQty;

	public Counter() {
	}

	public Counter(int upperLetterQty, int lowerLetterQty, int digitLetterQty) {
		this.upperLetterQty = upperLetterQty;
		this.lowerLetterQty = lowerLetterQty;
		this.digitLetterQty = digitLetterQty;
	}

	public int getUpperLetterQty() {
		return upperLetterQty;
	}

	public void setUpperLetterQty(int upperLetterQty) {
		this.upperLetterQty = upperLetterQty;
	}

	public int getLowerLetterQty() {
		return lowerLetterQty;
	}

	public void setLowerLetterQty(int lowerLetterQty) {
		this.lowerLetterQty = lowerLetterQty;
	}

	public int getDigitLetterQty() {
		return digitLetterQty;
	}

	public void setDigitLetterQty(int digitLetterQty) {
		this.digitLetterQty = digitLetterQty;
	}

	@Override
	public String toString() {
		return "Số lượng: \n" + "1. Kí tự in hoa:    " + upperLetterQty
				+ "\n2. Kí tự in thường: " + lowerLetterQty
				+ "\n3. Kí tự số:        " + digitLetterQty;
	}

}