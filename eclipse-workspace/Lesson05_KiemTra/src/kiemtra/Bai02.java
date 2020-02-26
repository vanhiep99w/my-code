package kiemtra;

import java.util.ArrayList;

public class Bai02 {

	static int length=7;
	
	
	public static void main(String[] args) {

		int[] arrA= {1,2,3,3,5,6,7};
		
		questionA(arrA);
		
		for(int i=0;i<length;i++) {
			System.out.println(arrA[i]);
		}
		
		
		
	}
	public static int[] questionA(int[] arr) {
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]==arr[j]) {
					delete(j, arr);
				}
			}
		}
		
		return arr;
	}
	
	public static int[] delete(int n,int[]arr) {
		for(int i=n;i<length-1;i++) {
			arr[i]=arr[i+1];
		}
		length--;
		return arr;
	}

}
