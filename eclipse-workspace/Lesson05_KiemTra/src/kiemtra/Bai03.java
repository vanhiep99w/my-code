package kiemtra;

public class Bai03 {

	public static void main(String[] args) {

		int[] arr=new int[5];
		int[] arr1= {1,2,3,5};
		for(int i=0;i<5;i++) {
			arr[i]=i+1;
		}
		for(int i=0;i<5;i++) {
			if(!check(arr[i], arr1)) {
				System.out.println(arr[i]);
			}
		}
	}

	public static boolean check(int n,int []arr1) {
		boolean temp=false;
		for(int i=0;i<4;i++) {
			if(arr1[i]==n) {
				temp=true;
			}
		}
		return temp;
	}
	
}
