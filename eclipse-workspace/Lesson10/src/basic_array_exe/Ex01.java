package basic_array_exe;

public class Ex01 {

	public static void main(String[] args) {
		// 1,2,3,4,2,1
		int[] numbers={1,2,3,4,2,1};
		// câu 1 viết hàm distinct
		
	}
	
	
		
	public static int[] unique(int[] arrInput) {
		int temp = 0;
		int[] arrTempResult = new int[10];
		int[] arrResult;

		int lenght = 0;
		for (int i = 0; i < arrInput.length; i++) {
			boolean b = true;
			for (int j = 0; j < arrInput.length; j++) {
				if (i == j)
					continue;
				if (arrInput[i] == arrInput[j]) {
					b = false;
				}
			}
			if (b == true) {
				arrTempResult[temp++] = arrInput[i];
				lenght++;
			}
		}
		arrResult = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			arrResult[i] = arrTempResult[i];
		}
		return arrResult;
		}
	}

