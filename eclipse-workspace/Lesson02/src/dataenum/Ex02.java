package dataenum;

public class Ex02 {
	public static void main(String[] args) {
		int xA = 3;
		int yA = 3;
		int xO = 0;
		int yO = 0;
		int R = 2;
		CircleString result = isPointBelongToCircle(xA, yA, xO, yO, R);
		System.out.println(result.getValue());
	}

	private static CircleString isPointBelongToCircle(int xA, int yA, int xO, int yO, int R) {
		double AO = Math.sqrt((xA - xO) * (xA - xO) + (yA - yO) * (yA - yO));
		if (AO > R) {
			return CircleString.OUTSIDE;
		} else if (AO == R) {
			return CircleString.ONSIDE;
		}
		return CircleString.INSIDE;
	}
}
