package basic_array;

public class Ex04 {

	public static void main(String[] args) {
		//in ra các phần tử chẵn trong mảng
		// tính tổng các phần tử lẻ trong mảng
		// thay đổi phần tử đầu tiền thành 199
		// tìm phần tử có giá trị lớn nhất trong mảng
		// thêm 1 phần tử vào vị trí bất kì trong mảng
		//xóa 1 phần tử tại vị trí bất kì trong mảng
		int[] numbers= {1,9,5,36,12,44,33};
		int[] result=deleteNumber(numbers, 3);
		for(int temp: result) {
			System.out.println(temp);
		}
	}
	public static void showEven(int[] number) {
		for(int temp: number) {
			if(temp%2==0) {
				System.out.println(temp);
			}
		}
	}
	public static int sum(int[] number) {
		int sum=0;
		for(int num: number) {
			if(num%2!=0) {
				sum+=num;
			}
		}
		return sum;
	}
	public static void replace(int[] number,int index,int value) {
		number[index]=value;
	}
	public static int maxNumber(int[]number) {
		int max=number[0];
		for(int i=1;i<number.length;i++) {
			if(number[i]>max) {
				max=number[i];
			}
		}
		return max;
	}
	public static int[] addNumber(int[]number,int index,int value) {
		int trueIndex=index-1;
		int[] result=new int[number.length+1];
		for(int i=0;i<trueIndex;i++) {
			result[i]=number[i];
		}
		result[trueIndex]=value;
		for(int i=trueIndex+1;i<result.length;i++) {
			result[i]=number[i-1];
		}
		return result;
	}
	public static int[] deleteNumber(int[]number,int index) {
		int[] result=new int[number.length-1];
		/*
		 * for(int i=0;i<index;i++) { result[i]=number[i]; } for(int
		 * i=index;i<result.length;i++) { result[i]=number[i+1]; }
		 */
		for(int i=0;i<result.length;i++) {
			if(i>=index) {
				result[i]=number[i+1];
				continue;
			}
			result[i]=number[i];
		}
		return result;
	}
}
