package Ex01;

public class Test1 {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 22, 5, 3,4, 8, 12,13,14, 1 };
		int len = 0, templen = 0, start = -1;
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1 || arr[i] > arr[i + 1]) {
				templen++;
				if (len < templen) {
					len = templen;
					start = i;
				}
				templen = 0;
			}
			if (i != arr.length - 1 && arr[i] <= arr[i + 1]) {
				templen++;
			}
		}
		System.out.println(len + " " + start);
		for (int i = start; i >start-len ; i--) {
			System.out.print( arr[i]+" ");
		}
	}
	
}
