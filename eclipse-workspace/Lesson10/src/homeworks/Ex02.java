package homeworks;

public class Ex02 {

	public static void main(String[] args) {
		int[][] arrInput = { { 1, 2, 3, 4 }, { 5, 0, 8, 8 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };
		int[][] arrResult;
		
		for (int i = 0; i < arrInput.length; i++) {
			for (int j = 0; j < arrInput[i].length; j++) {
				System.out.print(arrInput[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("================");
		arrResult=covertMaxtric(arrInput);
		for (int i = 0; i < arrResult.length; i++) {
			for (int j = 0; j < arrResult[i].length; j++) {
				System.out.print(arrResult[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isExistZero(int[][] arr, int row, int col) {
		for (int i = 0; i < arr[row].length; i++) {
			if (arr[row][i] == 0) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][col] == 0) {
				return true;
			}
		}
		return false;
	}

	public static int[][] covertMaxtric(int[][] arrInput) {
		int[][] arrResult = new int[arrInput.length][arrInput[1].length];
		for (int i = 0; i < arrResult.length; i++) {
			for (int j = 0; j < arrResult[i].length; j++) {
				arrResult[i][j] = arrInput[i][j];
			}
		}
		for (int i = 0; i < arrInput.length; i++) {
			for (int j = 0; j < arrInput[i].length; j++) {
				if (isExistZero(arrInput, i, j)) {
					arrResult[i][j] = 0;
				}
			}
		}

		return arrResult;
	}
}
