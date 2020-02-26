package kiemtra;

public class Bai04 {

	public static void main(String[] args) {
		int[] arr= {1,2,6,3,4,5,6,7,89,10};
		
	}
	public static int[] bai04(int[] arr){
		
		int temp=1,temp1=1,vt1,vt2;
		for(int i=0;i<10;) {
			for(int j=0;j<10;j++) {
				vt1=i;
				if(arr[i]<arr[j]) {
					temp++;
					vt2=j;
				}if(arr[i]>=arr[j]) {
					i=j;
					temp1=temp;
				}
			}
		}
		return arr;
	}
}
